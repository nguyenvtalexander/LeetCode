/**
because it's asking to return the leftmost pivot, that means that there may be multiple solutions
first build the pref in reverse due to the constraint mentioned above 
[1,7,3,6,5,6]
[27,20,17,11,6,0]
then go through the original array forwards and compare the running sum to the i + 1 index of the prefix
 */

 class Solution {
  fun pivotIndex(nums: IntArray): Int {
      val pref = IntArray(nums.size)
      pref[pref.lastIndex] = 0
      for (i in nums.lastIndex - 1 downTo 0) {
          pref[i] = pref[i + 1] + nums[i + 1]
      }

      var acc = 0
      for (i in pref.indices) {
          if (acc == pref[i]) {
              return i
          }
          acc += nums[i]
      }
      return -1
  }
}
