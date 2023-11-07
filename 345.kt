class Solution {
  fun reverseVowels(s: String): String {
      val set = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
      var l = 0
      var r = s.lastIndex
      var string = s.toCharArray()

      while (l < r) {
          when { 
              !set.contains(string[l]) -> l ++
              !set.contains(string[r]) -> r --
              set.contains(string[l]) && set.contains(string[r]) -> {
                  val temp = string[l]
                  string[l] = string[r]
                  string[r] = temp
                  l ++
                  r --
              }
          }
      }

      return String(string)
  }
}
