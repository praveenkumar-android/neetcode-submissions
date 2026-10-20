class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freaquencyMap  = HashMap<Int, Int>()

        for (num in nums) {
            freaquencyMap[num] = freaquencyMap.getOrDefault(num, 0) + 1
        }

        val sortedEntries = freaquencyMap.entries.sortedByDescending{ it.value }

        return sortedEntries.take(k).map{ it.key }.toIntArray()

    }
}
