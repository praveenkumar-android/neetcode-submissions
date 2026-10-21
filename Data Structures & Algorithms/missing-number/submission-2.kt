class Solution {
    fun missingNumber(nums: IntArray): Int {
        var n = nums.size
        
        for(i in nums.indices) {
            n = n xor i xor nums[i]
        }

        return n
    }
}
