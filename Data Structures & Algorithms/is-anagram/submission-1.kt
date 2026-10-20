class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        
        val charCount = IntArray(26)

        for(i in s.indices){
            charCount[s[i] - 'a']++
            charCount[t[i] - 'a']--
        }

        for(count in charCount) {
            if(count != 0)
            return false
        }
        return true
    }
}
