class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        val visitedNum = HashMap<Int, Int>()
        for(i in nums.indices){
            val currentNum = nums[i]
            val complement = target - currentNum

            if(visitedNum.containsKey(complement)) {
                return intArrayOf(visitedNum[complement]!!, i)
            }

            visitedNum[currentNum] = i
        }
        return intArrayOf()
    }
}
