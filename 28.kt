class Solution {
  fun strStr(haystack: String, needle: String): Int {
      for (i in 0..haystack.lastIndex - needle.lastIndex) {
          if (haystack.slice(i..i + needle.lastIndex) == needle) {
              return i
          }
      }
      return -1
  }
}
