class Solution {
  fun gcdOfStrings(str1: String, str2: String): String {
      if (str1 + str2 != str2 + str1) {
          return ""
      }

      val gcdLength = gcd(str1.length, str2.length)

      return str1.substring(0, gcdLength)
  }

  private fun gcd(a: Int, b: Int): Int {
      var x = a
      var y = b

      while (y != 0) {
          val temp = y
          y = x % y
          x = temp
      }

      return x
  }
}
