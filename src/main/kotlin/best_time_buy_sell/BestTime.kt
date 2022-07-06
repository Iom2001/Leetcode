package best_time_buy_sell

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in 0..prices.size - 2) {
            for (j in i + 1 until prices.size) {
                if (maxProfit < prices[j] - prices[i]) {
                    maxProfit = prices[j] - prices[i]
                }
            }
        }
        return maxProfit
    }

}

fun main() {
    val solution = Solution()
    println(solution.maxProfit(intArrayOf(7,6,4,3,1)))
}