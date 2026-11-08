class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var map = mutableMapOf<String, MutableList<String>>()

        for (word in strs){
            val key = word.toCharArray().sorted().joinToString("")

            if(map.contains(key)) {
                map[key]!!.add(word)
            } else {
                map[key] = mutableListOf(word)
            }
        }

        return map.values.toList()
    }
}
