class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var set = mutableSetOf<Char>()

        var left = 0
        var maxLength = 0

        for (right in s.indices) {

            while (set.contains(s[right])) {
                set.remove(s[left])
                left++
            }

            set.add(s[right])

            val length = right - left + 1

            if(length > maxLength) {
                maxLength = length
            }

        }

        return maxLength
 
    }
}
