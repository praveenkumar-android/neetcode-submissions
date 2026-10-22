class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleanedString = s.lowercase().filter { it.isLetterOrDigit() }

        var left = 0
        var right = cleanedString.length - 1

        while(left < right) {
            
            if(cleanedString[left] != cleanedString[right]) {
                return false
            }

            left++
            right--
        }

        return true
    }
}
