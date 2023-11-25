class Solution {
  fun combine(n: Int, k: Int): List<List<Int>> {
      val res = mutableListOf<List<Int>>()

      fun dfs(start: Int, comb: MutableList<Int>) {
          if (comb.size == k) {
              res.add(ArrayList(comb))
              return
          }

          for (i in start..n) {
              comb.add(i)
              dfs(i + 1, comb)
              comb.removeAt(comb.size - 1)
          }
      }

      dfs(1, mutableListOf<Int>())
      return res
  }
}
