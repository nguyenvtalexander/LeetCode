class Solution {
  fun removeDuplicates(nums: IntArray): Int {
      var pointer = 1

      for (i in 1..nums.lastIndex) {
          if (nums[i] != nums[i - 1]) {
              nums[pointer] = nums[i]
              pointer ++
          }
      }
      return pointer
  }
}
