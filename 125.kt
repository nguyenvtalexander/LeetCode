class Solution {
  fun isPalindrome(s: String): Boolean {
      var l = 0
      var r= s.length - 1

      while (l < r) {
          when {
              !s[l].isLetterOrDigit() -> l++
              !s[r].isLetterOrDigit() -> r--
              s[l].toLowerCase() == s[r].toLowerCase() -> {
                  l++
                  r--
              }
              else -> return false
          }    
      }
      return true
  }
}
