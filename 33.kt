class Solution {
  fun search(nums: IntArray, target: Int): Int {
      var l = 0
      var r = nums.lastIndex
      while (l <= r) {
          val mid = l + (r - l) / 2
          when {
              nums[mid] == target -> return mid
              nums[l] <= nums[mid] -> {
                  if (target >= nums[l] && target < nums[mid]) {
                      r = mid - 1
                  } else {
                      l = mid + 1
                  }
              }
              
              else -> {
                  if (target > nums[mid] && target <= nums[r]) {
                      l = mid + 1
                  } else {
                      r = mid - 1
                  }
              }
          }
      }
      return -1
  }
}
