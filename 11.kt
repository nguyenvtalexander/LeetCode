class Solution {
  fun maxArea(height: IntArray): Int {
      var l = 0
      var r = height.lastIndex
      var maxVolume = 0

      while (l < r) {
          val curHeight = min(height[l], height[r])
          val curVolume = curHeight * (r - l) 
          maxVolume = max(maxVolume, curVolume)

          if (height[l] < height[r]) l ++
          if (height[r] <= height[l]) r--
      }
      return maxVolume
  }
}
