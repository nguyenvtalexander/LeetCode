class Solution {
  fun characterReplacement(s: String, k: Int): Int {
      val count = mutableMapOf<Char, Int>()

      var l = 0
      var maxf = 0
      var r = 0
      while (r < s.length) {
          count[s[r]] = count.getOrDefault(s[r], 0) + 1
          maxf = max(maxf, count[s[r]] ?: 0)

          if ((r - l + 1) - maxf > k) {
              count[s[l]] = count[s[l]]!! - 1
              l++
          }

          r++
      }

      return (r - l)
  }
}
