class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false 

        val ccount = IntArray(26)

        for(i in s.indices) {
            ccount[s[i] - 'a']++
            ccount[t[i] - 'a']--
        }

        for (count in ccount) {
            if(count != 0)
            return false
        }
        return true
    }
}
