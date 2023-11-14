/**
 * basic recursion
 */

class Solution {
  fun fib(n: Int): Int {
      if (n <= 0) return 0
      if (n == 1) return 1
      return fib(n - 1) + fib(n - 2)
  }
}

/**
 * memo implmentation
 */

class Solution {
  fun fib(n: Int): Int {
      val memo = IntArray(n + 1) { -1 }
      return helper(n, memo)
  }

  fun helper(n: Int, memo: IntArray): Int {
      if (n == 0) return 0
      if (n == 1) return 1
      if (memo[n] != -1) return memo[n]
      memo[n] = fib(n - 1) + fib(n - 2)
      return memo[n]
  }
}