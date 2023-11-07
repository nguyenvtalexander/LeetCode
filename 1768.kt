class Solution {
  fun mergeAlternately(word1: String, word2: String): String {
      var size = 0
      var res = ""
      var longerWord = ""

      when {
          word1.lastIndex > word2.lastIndex -> {
              size = word2.lastIndex
              longerWord = word1
          }
          else -> { 
              size = word1.lastIndex
              longerWord = word2 }
      }

      for (i in 0..size) {
          res += word1[i]
          res += word2[i]
      }

      for (i in size + 1..longerWord.lastIndex) {
          res += longerWord[i]
      }

      return res
  }
}
