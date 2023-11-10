/**
 * first solution on my own I used a set to track the visited nodes
 * this is unecessary, I can instead mark them by changing the existing array values to 0
 */
class Solution {
  fun numIslands(grid: Array<CharArray>): Int {
      val visited = HashSet<Pair<Int, Int>>()
      var count = 0

      for (r in grid.indices) {
          for (c in grid[0].indices) {
              if (islandCheck(grid, r, c, visited)) count ++
          }
      }
      
      return count
  }

  private fun islandCheck(
      grid: Array<CharArray>, 
      r: Int, 
      c: Int, 
      visited: HashSet<Pair<Int, Int>>): Boolean {
          var flag = false
          if (visited.add(Pair(r,c,))) {
              var node = grid.getOrNull(r)?.getOrNull(c)
              when (node) {
                  '1' -> {
                      flag = true
                      islandCheck(grid, r - 1, c, visited)
                      islandCheck(grid, r + 1, c, visited)
                      islandCheck(grid, r, c - 1, visited)
                      islandCheck(grid, r, c + 1, visited)
                  }
              }
          }
          return flag
  }
}

class Solution {
  fun numIslands(grid: Array<CharArray>): Int {
      var count = 0

      for (r in grid.indices) {
          for (c in grid[0].indices) {
              if (grid[r][c] == '1') {
                  islandCheck(grid, r, c)
                  count ++
              }
          }
      }
      
      return count
  }

  private fun islandCheck(grid: Array<CharArray>, r: Int, c: Int) {
      if (r < 0 || c < 0 || r > grid.lastIndex || c > grid[0].lastIndex || grid[r][c] == '0') return
      
      grid[r][c] = '0'
      islandCheck(grid, r - 1, c)
      islandCheck(grid, r + 1, c)
      islandCheck(grid, r, c - 1)
      islandCheck(grid, r, c + 1)
  }
}