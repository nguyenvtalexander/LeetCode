class Solution {
  fun twoSum(numbers: IntArray, target: Int): IntArray {
      var l = 0
      var r = numbers.lastIndex

      while (l < r) {
          val sum = numbers[l] + numbers[r]
          when {
              sum == target -> return listOf(l + 1, r + 1).toIntArray()
              sum > target -> r --
              sum < target -> l ++
          }
      }

      return listOf(-1).toIntArray()
  }
}
