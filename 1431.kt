class Solution {
  fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
      val most = candies.max()
      val res = candies.map {
          if (it + extraCandies >= most) {
              true
          } else {
              false
          }
      }
      return res
  }
}
