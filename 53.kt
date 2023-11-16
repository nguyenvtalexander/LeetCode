class Solution {
  fun maxSubArray(nums: IntArray): Int {
      var curSum = 0
      var curMax = nums[0]

      for (i in nums.indices) {
          curSum = max(curSum, 0)
          curSum += nums[i]
          curMax = max(curSum, curMax)
      }

      return curMax
  }
}
