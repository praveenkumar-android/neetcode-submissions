class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices){
            val currentNum = nums[i]
            val complement = target - currentNum

            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!!, i)
            }

            map[currentNum] = i
        }
        return intArrayOf()
    }
}
