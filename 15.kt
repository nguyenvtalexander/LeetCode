/*
Similar to two-sum
Initiate results set
  - use set such that there aren't duplicate results
Sort nums
Iterate through nums.lastIndex - 1
For each num, nums[i +1] until nums.lastIndex 
Create a left and right pointer
While left is less than right calculate sum
If it equals the target, append the list to the set
If it's less, increase the left pointer, else decrement right pointer
return results as a list

sort is O(nlog(n))
loops are O(N^2)
space O(1) || O(N) - sorting might take extra memory in some libraries

Final: 
Time - O(N^2)
Space - O(1) for Kotlin
*/

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
