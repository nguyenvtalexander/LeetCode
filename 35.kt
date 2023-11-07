class Solution {
  fun searchInsert(nums: IntArray, target: Int): Int {
      for (i in nums.indices) {
          when {
              nums[i] == target || nums[i] > target -> return i
              nums[i] < target && i == nums.lastIndex -> return i + 1
          }
      }
      return -1
  }
}
