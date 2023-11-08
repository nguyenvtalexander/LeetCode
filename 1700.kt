class Solution {
  fun countStudents(students: IntArray, sandwiches: IntArray): Int {
      val stu = students.toMutableList()
      val sand = sandwiches.toMutableList()
  
      var count = 0
      while (sand.size > 0 && stu.size > 0) {
          if (stu[0] == sand[0]) {
              stu.removeAt(0)
              sand.removeAt(0)
              count = 0
          } else {
              count ++
              if (count > stu.size) break
              val temp = stu.removeAt(0)
              stu.add(temp)
          }
      }

      return stu.size
  }
}
