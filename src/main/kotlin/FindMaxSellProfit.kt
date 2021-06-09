import kotlin.math.max
import kotlin.math.min

/*
    * Given an array representing prices of the stock on different days,
    * find the maximum profit that can be earned by performing maximum of one transaction.
    * A transaction consists of activity of buying and selling the stock on different or same days.
    *
    * Eg: 1 - {100, 80, 120, 130, 70, 60, 100, 125}
    * the price of the stock on day-1 is 100, on day-2 is 80 and so on.
    * The maximum profit that could be earned in this window is 65 (buy at 60 and sell at 125).
    *
    * Eg: 2 - For price array - {100, 80, 70, 65, 60, 55, 50}, maximum profit that could be earned is 0.
    * tutorial: https://www.educative.io/m/find-maximum-single-sell-profit
    * */
fun main(args: Array<String>) {
    var stockSells1 = arrayListOf(100, 80, 120, 130, 70, 60, 100, 125)
    val stockSells2 = arrayListOf(100, 80, 70, 65, 60, 55, 50)
    val findMax = FindMaxSellProfit()
    val maxProfit = findMax.maxStockProfit(stockSells1)
    println(maxProfit)

}
class FindMaxSellProfit {

    fun maxStockProfit(stocks: ArrayList<Int>): Int {
        var maxSellProfit = 0
        var minimumPrice = Int.MAX_VALUE

        stocks.forEach {
            maxSellProfit = max(maxSellProfit, it-minimumPrice)
            minimumPrice = min(minimumPrice, it)
           // println(maxSellProfit)
        }

        return maxSellProfit
    }
}