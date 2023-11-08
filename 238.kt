/*
The first solution is easier to follow, but the seond one uses less space
use n as an accumulator. Update res[i] first and then update the accumulator
this will create an array of all the products to the left of the index and then do 
the same in reverse to multiply the products to the rigth and left together replacing 
results[i]
 */

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
