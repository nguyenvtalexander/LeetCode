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

class Solution {
  fun subsetsWithDup(nums: IntArray): List<List<Int>> {
      nums.sort()
      val res = HashSet<List<Int>>()
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
      return res.toList()
  }
}

class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = HashSet<List<Int>>()
        
        fun dfs(start: Int, sub: MutableList<Int>) {
            res.add(ArrayList(sub))
            for (n in start..nums.lastIndex) {
                sub.add(nums[n])
                dfs(n + 1, sub)
                sub.removeAt(sub.size - 1)
            }
        }
        dfs(0, mutableListOf())
        return res.toList()
    }
}
