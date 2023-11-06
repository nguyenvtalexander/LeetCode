class Solution {
  fun search(nums: IntArray, target: Int): Int {
      var l = 0
      var r = nums.lastIndex
      while (l <= r) {
          val mid = (l + r) / 2
          if (nums[mid] == target) {
              return mid
          } else if (nums[mid] > target) {
              r --
          } else {
              l ++
          }
      }
      return -1
  }
}
