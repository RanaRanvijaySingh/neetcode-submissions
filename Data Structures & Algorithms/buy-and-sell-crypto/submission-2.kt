class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0
        
        for(i in 0 until prices.size) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            }
            val currentProfit = prices[i] - minPrice
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit
            }
        }
        
        return maxProfit
    }
}