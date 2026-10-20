class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()

        for (str in strs) {
            val count = IntArray(26)

            for (c in str) {
                count[c - 'a']++
            }

            val key = count.joinToString(" ")
            
            if(!map.containsKey(key)){
                map[key] = mutableListOf()
            }
            map[key]?.add(str)
        }
        return map.values.toList()
    }
}
