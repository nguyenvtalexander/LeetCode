class Solution {
  fun calPoints(operations: Array<String>): Int {
      val score = mutableListOf<Int>()
      for (i in 0..operations.lastIndex) {
          if (operations[i].contains(Regex("\\d"))) {
              score.add(operations[i].toInt())
          } else if (operations[i] == "+") {
              score.add(score[score.lastIndex] + score[score.lastIndex - 1])
          } else if (operations[i].toString() == "D") {
              score.add(score[score.lastIndex] * 2)
          } else {
              score.removeAt(score.lastIndex)
          }
      }

      if (score.size < 1) { return 0 }
      return score.reduce { acc, int -> acc + int }
  }
}
