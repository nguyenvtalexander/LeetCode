/**
loop
    find the minimum value at each iteration
    calculate the cur position - the minimum and find the max between that and the previous max
    return the max
 */
class Solution {
  fun maxProfit(prices: IntArray): Int {
      var curMin = prices[0] 
      var curMax = 0
      for (price in prices) { 
          curMax = max(curMax, price - curMin) 
          curMin = min(price, curMin)
      }
      return curMax
  }
}
