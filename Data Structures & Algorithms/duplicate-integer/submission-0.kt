class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val list = HashSet<Int>()
        for(num in nums) {
            if(list.contains(num)) {
                return true
            }
            list.add(num)
        }
        return false
    }
}
