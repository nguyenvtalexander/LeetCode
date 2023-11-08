/*
The first solution is better in space
same concept but less line of code/variables
 */

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

/*
"aaa"
"ababa" 
track both strings
update the index for the s pointer only if it equals the t pointer
if the s pointer is equal to it's length return true
*/

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var sIdx = 0
        var tIdx = 0

        while (sIdx <= s.lastIndex && tIdx <= t.lastIndex) {
            if (s[sIdx] == t[tIdx]) {
                sIdx ++
                tIdx ++
            } else {
                tIdx ++
            }
        }
        return sIdx == s.lastIndex + 1
    }
}
