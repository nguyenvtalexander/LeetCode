class Solution {
  fun isSubsequence(s: String, t: String): Boolean {
      var sIndex = 0
      for (tIndex in t.indices) {
          if (sIndex == s.length) {
              return true
          }
          if (s[sIndex] == t[tIndex]) {
              sIndex ++ 
          }
      }
      return s.length == sIndex
  }
}
