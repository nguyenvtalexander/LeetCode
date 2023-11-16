class Solution {
  fun orangesRotting(grid: Array<IntArray>): Int {
      val que = ArrayDeque<Pair<Int, Int>>()
      var minutes = 0

      for (r in grid.indices) {
          for (c in grid[0].indices) {
              if (grid[r][c] == 2) {
                  que.add(Pair(r, c))
              }
          }
      }

      while (!que.isEmpty()) {
          val size = que.size

          for (i in 0..size - 1) {
              val cur = que.removeFirst()

              for (i in dr.indices) {
                  val newR = dr[i] + cur.first
                  val newC = dc[i] + cur.second

                  if (newR in 0..grid.lastIndex &&
                  newC in 0..grid[0].lastIndex &&
                  grid[newR][newC] == 1) {
                      grid[newR][newC] = 2
                      que.add(Pair(newR, newC))
                  }
              }
          }
          minutes++
      }

      for (r in grid.indices) {
          for (c in grid[0].indices) {
              if (grid[r][c] == 1) return -1
          }
      }
              
      return if (minutes > 0) minutes - 1 else 0
  }

  companion object {
      val dr = intArrayOf(1, 0, -1, 0)
      val dc = intArrayOf(0, 1, 0, -1)
  }
}