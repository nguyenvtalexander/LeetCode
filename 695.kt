class Solution {
  fun maxAreaOfIsland(grid: Array<IntArray>): Int {
      var curMax = 0
      for (r in grid.indices) {
          for (c in grid[0].indices) {
              curMax = max(findArea(grid, r, c, 0), curMax)
          }
      }
      return curMax
  }

  private fun findArea(grid: Array<IntArray>, sr: Int, sc: Int, area: Int): Int {
      var sumArea = area
      if (grid.getOrNull(sr)?.getOrNull(sc) != null && grid[sr][sc] == 1) {
          grid[sr][sc] = 0
          return sumArea + 1 + findArea(grid, sr + 1, sc, area) + findArea(grid, sr - 1, sc, area) +findArea(grid, sr, sc + 1, area) + findArea(grid, sr, sc - 1, area)
      }
      return sumArea
  }
}

class Solution {
  fun maxAreaOfIsland(grid: Array<IntArray>): Int {
      var curMax = 0
      for (r in grid.indices) {
          for (c in grid[0].indices) {
              curMax = max(findArea(grid, r, c), curMax)
          }
      }
      return curMax
  }

  private fun findArea(grid: Array<IntArray>, sr: Int, sc: Int): Int {
      if (grid.getOrNull(sr)?.getOrNull(sc) == null || grid[sr][sc] != 1) {
          return 0
      }
      grid[sr][sc] = 0
      return 1 + findArea(grid, sr + 1, sc) + findArea(grid, sr - 1, sc) +findArea(grid, sr, sc + 1) + findArea(grid, sr, sc - 1)
  }
}

class Solution {
  fun maxAreaOfIsland(grid: Array<IntArray>): Int {
      var max = 0
      for (r in grid.indices) {
          for (c in grid[0].indices) {
              if (grid[r][c] == 1) {
                  max = max(findArea(grid, r, c), max)
              }
          }
      }
      return max
  }

  fun findArea(grid: Array<IntArray>, r: Int, c: Int): Int {
      val square = grid.getOrNull(r)?.getOrNull(c)
      if (square == 0 || square == null) return 0 
      grid[r][c] = 0
      return  (1 + findArea(grid, r + 1, c) +
              findArea(grid, r - 1, c) + 
              findArea(grid, r, c + 1) + 
              findArea(grid, r, c - 1))
  }
}