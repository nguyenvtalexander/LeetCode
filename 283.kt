class Solution {
  fun moveZeroes(nums: IntArray): Unit {
      var pointer = 0
      for (i in 0..nums.lastIndex) {
          if (nums[i] != 0) {
              val temp = nums[i]
              nums[i] = 0
              nums[pointer] = temp 
              pointer ++
          }
      }
  }
}
