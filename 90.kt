class Solution {
  fun subsetsWithDup(nums: IntArray): List<List<Int>> {
      nums.sort()
      val res = HashSet<List<Int>>()
      val sub = mutableListOf<Int>()

      fun dfs(n: Int) {
          if (n >= nums.size) {
              res.add(ArrayList(sub))
              return
          }

          sub.add(nums[n])
          dfs(n + 1)

          sub.removeAt(sub.size - 1)
          dfs(n + 1)
      }
      dfs(0)
      return res.toList()
  }
}
