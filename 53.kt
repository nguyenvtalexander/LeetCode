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

class Solution {
  fun maxSubArray(nums: IntArray): Int {
      var maxSub = nums[0]
      var curSum = nums[0]

      for (i in 1 until nums.size) {
          curSum = max(nums[i], curSum + nums[i])
          maxSub = max(maxSub, curSum)
      }

      return maxSub
  }
}