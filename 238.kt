class Solution {
  fun productExceptSelf(nums: IntArray): IntArray {
      val n = nums.size
      val result = IntArray(n)

      val prefix = IntArray(n)
      prefix[0] = 1
      for (i in 1 until n) {
          prefix[i] = prefix[i - 1] * nums[i - 1]
      }

      val postfix = IntArray(n)
      postfix[n - 1] = 1
      for (i in (n - 2) downTo 0) {
          postfix[i] = postfix[i + 1] * nums[i + 1]
      }

      for (i in 0 until n) {
          result[i] = prefix[i] * postfix[i]
      }

      return result
  }
}