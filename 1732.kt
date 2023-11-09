/**
 * naive solution, try to solve with running variable that tracks the highest value at any given point
 * and the previous running value to accumulate and compare to update the highest value
 */

class Solution {
  fun largestAltitude(gain: IntArray): Int {
      val res = IntArray(gain.size + 1) 
      res[0] = 0
      for (i in gain.indices) {
          res[i + 1] = gain[i] + res[i]
      }
      return res.max()
  }
}
