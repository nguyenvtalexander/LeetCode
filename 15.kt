class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val results = HashSet<List<Int>>()
        val sNums = nums.sorted()

        for (i in 0..sNums.lastIndex - 1) {
            var l = i + 1
            var r = sNums.lastIndex
            while (l < r) {
                val sum = sNums[i] + sNums[l] + sNums[r]
                if (sum == 0) {
                    results.add(listOf(sNums[i], sNums[l], sNums[r]))
                    l ++ 
                    r --
                } else if (sum > 0) {
                    r --
                } else {
                    l ++
                }
            }
        }

        return results.toList()
    }
}