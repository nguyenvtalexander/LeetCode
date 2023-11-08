// Classic Binary search, log(N), log(N) if recursive, O(1) if iterative

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.lastIndex

        while (l <= r) {
            val mid = (l + r) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return -1
    }
}