/*
FB array problem
worded strangely to confuse, but just checking for equivalent values
*/

class Solution {
  fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
      return count(target) == count(arr)
  }

  fun count(nums: IntArray): HashMap<Int, Int> {
      val map = HashMap<Int, Int>()
      for (num in nums) {
          map[num] = map.getOrDefault(num, 0) + 1
      }
      return map
  }
}
