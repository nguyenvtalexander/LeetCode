class Solution {
  fun merge(intervals: Array<IntArray>): Array<IntArray> {
  if (intervals.isEmpty()) {
      return intervals
  }

  // Sort intervals based on start points
  intervals.sortBy { it[0] }

  val result = mutableListOf<IntArray>()
  var currentInterval = intervals[0]

  for (i in 1 until intervals.size) {
      val nextInterval = intervals[i]

      // Merge overlapping intervals
      if (currentInterval[1] >= nextInterval[0]) {
          currentInterval[1] = maxOf(currentInterval[1], nextInterval[1])
      } else {
          // Add non-overlapping interval to the result
          result.add(currentInterval)
          currentInterval = nextInterval
      }
  }

  // Add the last interval to the result
  result.add(currentInterval)

  return result.toTypedArray()
  }
}