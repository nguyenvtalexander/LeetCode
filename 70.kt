class Solution {
  fun climbStairs(n: Int): Int {
      val memo = IntArray(n + 1) { -1 }
      return helper(n, memo)
  }
  
  private fun helper(n: Int, memo: IntArray): Int {
      if (n <= 2) { return n }
      if (memo[n] != -1) return memo[n]
      memo[n] = helper(n - 1, memo) + helper(n - 2, memo)
      return memo[n]
  }
}