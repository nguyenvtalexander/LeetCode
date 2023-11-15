/**
iterate through intervals
compare beginning of new interval to the end of the current one
 */

 class Solution {
  fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
      val results = mutableListOf<IntArray>()
      var i = 0

      while (i < intervals.size && intervals[i][1] < newInterval[0]) {
          results.add(intervals[i])
          i++
      }

      while (i < intervals.size && intervals[i][0] <= newInterval[1]) {
          newInterval[0] = min(intervals[i][0], newInterval[0])
          newInterval[1] = max(intervals[i][1], newInterval[1])
          i++
      }

      results.add(newInterval)

      while (i < intervals.size) {
          results.add(intervals[i])
          i++
      }
      
      return results.toTypedArray()
  }
}