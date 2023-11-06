/*
Use a prefix sum
O(N) time and space for building the prefix
O(1) time and space for sumRange
*/
class NumArray(nums: IntArray) {
  val nums = nums
  val prefix = buildPrefix(nums)

  fun buildPrefix(nums: IntArray): IntArray {
      val prefix = mutableListOf<Int>()
      var total = 0
      for (num in nums) {
          total += num
          prefix.add(total)
      }
      println(prefix)
      return prefix.toIntArray()
  }

  fun sumRange(left: Int, right: Int): Int {
      if (left == 0) {
          return prefix[right]
      } else {
          return prefix[right] - prefix[left - 1]
      }
  }

}

/**
* Your NumArray object will be instantiated and called as such:
* var obj = NumArray(nums)
* var param_1 = obj.sumRange(left,right)
*/