class Solution {
  fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
      intervals.sortBy { it[0] }
      var count = 0
      var cur = intervals[0]
      for (i in 1..intervals.lastIndex) {
          if (cur[1] > intervals[i][0]) {
              cur[1] = min(intervals[i][1], cur[1])
              count++
          } else {
              cur[1] = intervals[i][1]
          }
      }
      return count
  }
}
