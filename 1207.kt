class Solution {
  fun uniqueOccurrences(arr: IntArray): Boolean {
      val map = HashMap<Int, Int>()
      for (num in arr) {
          map[num] = map.getOrDefault(num, 0) + 1
      }

      return (map.values.toSet().size == map.values.size)
  }
}
