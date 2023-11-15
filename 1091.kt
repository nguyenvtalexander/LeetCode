class Solution {
  fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
      val lastIndex = grid.lastIndex
      if (grid[0][0] == 1 || grid[lastIndex][lastIndex] == 1) return -1
      var count = 1
      val que = ArrayDeque<Pair<Int, Int>>()
      que.add(Pair(0,0))

      //while que isn't empty
      while (!que.isEmpty()) {
          //iterate through the current size
          val size = que.size
          for (i in 0..size - 1) {
              //pop from the deque
              val cur = que.removeFirst()
              //return the current count if the end has been reached
              if (cur.first == lastIndex && cur.second == lastIndex) return count
              //if not, iterate through the 8 directions and check if it's valid
              for (i in dr.indices) {
                  val newR = cur.first + dr[i]
                  val newC = cur.second + dc[i]
                  if (newR in 0..lastIndex && newC in 0..lastIndex && grid[newR][newC] == 0) {
                      //if it's valid, mark it as visited and add it to the que for the next outmost loop
                      grid[newR][newC] = 1
                      que.add(Pair(newR, newC))
                  }
              }
          }
          //increment the count after each consecutive bfs
          count ++
      }
      return -1
  }

  companion object {
      val dr = intArrayOf(-1, 1, 0, 1, -1, 0, -1, 1)
      val dc = intArrayOf(-1, 1, 1, 0, 0, -1, 1, -1)
  }
}

class Solution {
  fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
      val lastIndex = grid.lastIndex
      if (grid[0][0] == 1 || grid[lastIndex][lastIndex] == 1) return -1
      var count = 1
      val que = ArrayDeque<Pair<Int, Int>>()
      que.add(Pair(0,0))

      while (!que.isEmpty()) {
          val size = que.size

          for (i in 0..size - 1) {
              val cur = que.removeFirst()
              if (cur.first == lastIndex && cur.second == lastIndex) return count
              if (grid[cur.first][cur.second] == 0) {

                  grid[cur.first][cur.second] = 1

                  for (i in dr.indices) {
                      val newRow = cur.first + dr[i]
                      val newCol = cur.second + dc[i]

                      if (newRow in 0..lastIndex && 
                      newCol in 0..lastIndex && 
                      grid[newRow][newCol] == 0) {
                          que.add(Pair(newRow, newCol))
                      }
                  }
              }
          }
          count++
      }
      return -1
  }

  companion object {
      val dr = intArrayOf(-1, 1, 1, -1, -1, 1, 0, 0)
      val dc = intArrayOf(0, 0, 1, -1, 1, -1, -1, 1)
  }
}