class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        var count = IntArray(26)

        for(chr in s.indices) {
            count[s[chr] - 'a']++
            count[t[chr] - 'a']--
        }

        for(num in count) {
            if(num != 0) return false
        }

        return true
    }
}
