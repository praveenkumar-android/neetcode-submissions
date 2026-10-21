class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        var actualSum = 0
        val expectedSum = n * (n+1)/2

        for (num in nums) {
            actualSum += num
        }

        return expectedSum - actualSum
    }
}
