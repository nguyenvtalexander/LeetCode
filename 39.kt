class Solution {
  fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
      val res = mutableListOf<List<Int>>()

      fun combine(n: Int, curSum: Int, comb: MutableList<Int>) {
          if (curSum == target) {
              res.add(ArrayList(comb))
              return
          }

          if (curSum > target) return

          for (i in n..candidates.lastIndex) {
              comb.add(candidates[i])
              combine(i, curSum + candidates[i], comb)
              comb.removeAt(comb.size - 1)
          }
      }
      combine(0, 0, mutableListOf())
      return res
  }
}
