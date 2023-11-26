class Solution {
  fun exist(board: Array<CharArray>, word: String): Boolean {
      for (r in board.indices) {
          for (c in board[0].indices) {
              if (board[r][c] == word[0] && dfs(board, word, r, c, 0)) return true
          }
      }
      return false
  }

  fun dfs(board: Array<CharArray>, word: String, r: Int, c: Int, count: Int): Boolean {
      var found = false
      if (count == word.length) return true
      val square = board.getOrNull(r)?.getOrNull(c)
      if (square == word[count]) {
          val temp = board[r][c]
          board[r][c] = '*'
          found = dfs(board, word, r + 1, c, count + 1) ||
              dfs(board, word, r - 1, c, count + 1) ||
              dfs(board, word, r, c + 1, count + 1) ||
              dfs(board, word, r, c - 1, count + 1)

          board[r][c] = temp
      } 
      return found
  }
}
