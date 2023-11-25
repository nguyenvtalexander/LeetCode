class Solution {
  fun lengthOfLongestSubstring(s: String): Int {
      val charIndex = mutableMapOf<Char, Int>()
      var maxLength = 0
      var start = 0

      for ((index, char) in s.withIndex()) {
          if (charIndex.containsKey(char) && charIndex[char]!! >= start) {
              start = charIndex[char]!! + 1
          } else {
              maxLength = maxOf(maxLength, index - start + 1)
          }
          charIndex[char] = index
      }

      return maxLength
  }
}

class Solution {
  fun lengthOfLongestSubstring(s: String): Int {
      val hs = HashSet<Char>()
      var i = 0
      var j = 0
      var maxLength = 0
      while (j < s.length) {
          if (hs.contains(s[j])) {
              hs.remove(s[i++])
          } else {
              hs.add(s[j++])
              maxLength = max(hs.size, maxLength)
          }
      }
      return maxLength
  }
}
