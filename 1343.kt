class Solution {
  fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
      var subList = ArrayDeque<Int>()
      var l = 0
      var count = 0

      for (r in arr.indices) {
          if (subList.size == k) {
              if (subList.average() >= threshold) count++
          }

          if (r + l >= k) {
              subList.removeFirst()
              l++
          }

          subList.add(arr[r])
      }
      if (subList.average() >= threshold) count++
      return count
  }
}

/**
 * the previous solution above uses a window, but the average function makes it O(N)^2, we want to maintain
 * a running sum instead
 */

 class Solution {
  fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
      var sum = 0
      var count = 0 

      for (r in arr.indices) {
          sum += arr[r]

          if (r >= k - 1) {
              if (r >= k) sum -= arr[r - k]
              if (sum / k >= threshold) count++
          }
      }
      return count
  }
}