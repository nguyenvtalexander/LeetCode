/*
Create a set O(N)
Iterate through nums and check if the set contains num - 1
 */

class Solution {
  fun longestConsecutive(nums: IntArray): Int {
      val set = nums.toHashSet()
      var longest = 0

      for (num in nums) {
          if (!set.contains(num - 1)) {
              var length = 1
              while (set.contains(num + length)) {
                  length += 1
              }
              longest = max(length, longest)
          }
      }

      return longest
  }
}