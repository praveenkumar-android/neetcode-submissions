class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int, Int>()

        for(i in nums.indices) {
            val required = target - nums[i]

            if(map.contains(required)) {
                return intArrayOf(map[required]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf()
    }
}
