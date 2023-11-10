/**
key = image[sr][sc]  
dfs so if sr + 1, sr - 1, sc + 1, sc - 1, any combination of these is equal to the key, replace it with color
*/
class Solution {
  fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
      val visited = HashSet<Pair<Int, Int>>()
      val key = image[sr][sc]
      dfs(image, sr, sc, key, visited, color)
      return image
  }

  private fun dfs(image: Array<IntArray>, r: Int, c: Int, key: Int, visited: HashSet<Pair<Int, Int>>, color: Int) {
      if ((r > image.lastIndex || r < 0 || c < 0 || c > image[0].lastIndex) || image[r][c] == null) return
      if (visited.add(Pair(r, c))) {
          if (image[r][c] == key) {
              image[r][c] = color
              dfs(image, r + 1, c, key, visited, color) 
              dfs(image, r - 1, c, key, visited, color)
              dfs(image, r, c - 1, key, visited, color) 
              dfs(image, r, c + 1, key, visited, color)
          }
      }
  }
}

/**
key = image[sr][sc]  
dfs so if sr + 1, sr - 1, sc + 1, sc - 1, any combination of these is equal to the key, replace it with color
*/
class Solution {
  fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
      val visited = HashSet<Pair<Int, Int>>()
      val key = image[sr][sc]
      dfs(image, sr, sc, key, visited, color)
      return image
  }

  private fun dfs(image: Array<IntArray>, r: Int, c: Int, key: Int, visited: HashSet<Pair<Int, Int>>, color: Int) {
      if (visited.add(Pair(r, c))) {
          if (image.getOrNull(r)?.getOrNull(c) == key) {
              image[r][c] = color
              dfs(image, r + 1, c, key, visited, color) 
              dfs(image, r - 1, c, key, visited, color)
              dfs(image, r, c - 1, key, visited, color) 
              dfs(image, r, c + 1, key, visited, color)
          }
      }
  }
}


class Solution {
  fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
      val visited = HashSet<Pair<Int, Int>>()
      val key = image[sr][sc]
      dfs (image, sr, sc, color, key, visited)
      return image
  }

  private fun dfs(image: Array<IntArray>, r: Int, c: Int, color: Int, key: Int, visited: HashSet<Pair<Int, Int>>) {
      if (visited.add(Pair(r,c)) && image.getOrNull(r)?.getOrNull(c) == key) {
          image[r][c] = color
          dfs(image, r + 1, c, color, key, visited)
          dfs(image, r - 1, c, color, key, visited)
          dfs(image, r, c + 1, color, key, visited)
          dfs(image, r, c - 1, color, key, visited)
      }
  }
}