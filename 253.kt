/*
lets sort all the beginnings
sort all the ends

hold onto a pointer in the ends

iterate through beginnings
if the beginning > end 
    increment endIndex
else increment rooms
*/

class Solution {
  fun minMeetingRooms(intervals: Array<IntArray>): Int {
      val starts = intervals.map { it[0] }.sorted()
      val ends = intervals.map { it[1] }.sorted()

      var eIdx = 0
      var rooms = 0

      for (start in starts) {
          if (start >= ends[eIdx]) eIdx++ else rooms++
      }
      return rooms
  }
}
