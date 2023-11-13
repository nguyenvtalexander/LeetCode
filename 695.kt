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

