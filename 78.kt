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

class Solution {
  fun subsets(nums: IntArray): List<List<Int>> {
      val res = mutableListOf<List<Int>>()
      val sub = mutableListOf<Int>()

      fun dfs(n: Int) {
          res.add(ArrayList(sub))
          for (i in n..nums.lastIndex) {
              sub.add(nums[i])
              dfs(i + 1)
              sub.removeAt(sub.size - 1)
          }
      }
      dfs(0)
      return res
  }
}

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        var res = mutableListOf<List<Int>>()
        
        fun dfs(start: Int, sub: MutableList<Int>) {
            res.add(ArrayList(sub))
            for (n in start..nums.lastIndex) {
                sub.add(nums[n])
                dfs(n + 1, sub)
                sub.removeAt(sub.size - 1)
            }
        }
        dfs(0, mutableListOf())
        return res
    }
}
