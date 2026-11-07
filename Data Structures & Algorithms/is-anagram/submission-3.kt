class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length) return false

        var count = IntArray(26)

        for (i in s.indices) {
            count[s[i] - 'a']++
            count[t[i] - 'a']--
         }

         for (num in count) {
            if(num != 0) return false
         }

        return true
    }
}
