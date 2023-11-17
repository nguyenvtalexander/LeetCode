class Solution {
  fun twoSum(nums: IntArray, target: Int): IntArray {
      val map = HashMap<Int, Int>() 
      for (i in nums.indices) {
          map[nums[i]]?.let { return intArrayOf(it, i) }
          map[target - nums[i]] = i
      }
      return intArrayOf()   
  }
}
