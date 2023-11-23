class Solution {
  fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
      val set = HashSet<Int>()
      var l = 0
      
      for (r in nums.indices) {
          if (r - l + 1 > k) {
              set.remove(nums[l])
              l++
          } else {
              if (!set.add(nums[r])) return true
          }
      }
      return false
  }
}

class Solution {
  fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
      val window = HashSet<Int>()
      for (i in nums.indices) {
          if (!window.add(nums[i])) return true
          if (window.size > k) window.remove(nums[i - k])
      }
      return false
  }
}
