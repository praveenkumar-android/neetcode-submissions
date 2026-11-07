class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var freq = IntArray(26)

        var left = 0
        var maxLength = 0
        var maxFreq = 0

        for (right in s.indices) {

            val index = s[right] - 'A'
            freq[index]++

            if(freq[index] > maxFreq) {
                maxFreq = freq[index]
            }

            val windowLength = right - left + 1

            if(windowLength - maxFreq > k) {
                val leftIndex = s[left] - 'A'

                freq[leftIndex]--
                left++
            }

            val currentLength = right - left + 1

            if (currentLength > maxLength) {
                maxLength = currentLength
            }

        }

        return maxLength
    }
}
