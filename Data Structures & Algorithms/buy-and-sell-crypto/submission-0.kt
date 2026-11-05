class Solution {
    fun maxProfit(prices: IntArray): Int {

        var minPrice = prices[0]
        var maxProfit = 0

        for (i in 1 until prices.size) {
            val profit = prices[i] - minPrice

            if (profit > maxProfit) {
                maxProfit = profit
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i]
            }

        }
        return maxProfit
    }
}
