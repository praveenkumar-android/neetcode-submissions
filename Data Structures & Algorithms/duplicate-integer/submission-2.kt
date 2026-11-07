class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var numList = mutableListOf<Int>()

        for (num in nums.indices) {
            if (numList.contains(nums[num]))
            {
                return true
            }
            numList.add(nums[num])
        }
        return false
    }
}
