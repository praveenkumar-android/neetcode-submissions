class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for(num in nums) {
           map[num] = map.getOrDefault(num, 0) + 1
        }

        val sortedNumbers = map.entries.sortedByDescending { it.value }
        
        return sortedNumbers.take(k).map { it.key }.toIntArray()
    }
}
