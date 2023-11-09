/**
one solution is to iterate through each array, and check if the other array contains that value
if not, append it to the answer list

second solution will take more space, but is faster it's linear over n squared
save the nums in hashsets first

ran into two issues
I instantiated the hashsets wrong -- .toHashSet() is to convert, hashSetOf() takes in elements separated 
by a comma so if an array is passed in, the array will be the element

didn't account for distinct values at first
 */

 class Solution {
  fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
      val set1 = nums1.toHashSet()
      val set2 = nums2.toHashSet()
      val res = mutableListOf<List<Int>>()
      val ans1 = HashSet<Int>()
      val ans2 = HashSet<Int>()

      for (num in nums1) {
          if (!set2.contains(num)) {
              ans1.add(num)
          }
      }

      for (num in nums2) {
          if (!set1.contains(num)) {
              ans2.add(num)
          }
      }

      res.add(ans1.toList())
      res.add(ans2.toList())
      return res
  }
}
