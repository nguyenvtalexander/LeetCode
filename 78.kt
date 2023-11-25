class Solution {
  fun subsets(nums: IntArray): List<List<Int>> {
      val results = mutableListOf<List<Int>>()
      val sub = mutableListOf<Int>()

      fun dfs(n: Int) {
          if (n >= nums.size) {
              results.add(ArrayList(sub))
              return
          }
          sub.add(nums[n])
          dfs(n + 1)

          sub.removeAt(sub.size - 1)
          dfs(n + 1)
      }

      dfs(0)
      return results
  }
}
