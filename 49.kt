/*


 */

class Solution {
  fun groupAnagrams(strs: Array<String>): List<List<String>> {
      val map = HashMap<String, MutableList<String>>()
      for (str in strs) {
          val key = str.toCharArray().sorted().toString()
          map[key] = map.getOrDefault(key, mutableListOf<String>())
          map[key]?.add(str)
      }
      return map.values.toList()
  }
}
