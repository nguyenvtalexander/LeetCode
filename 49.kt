/*
Create a map where the key is the sorted string
Iterate through strings
If sorted string exists in map, add the string to the list of values 
If not, create a key, and then add it
Return the list of values

Time: 
O(N) - size of the input
O(Klog(K)) sorting string
Space: 
O(N) - size of the input
O(K) - size of string

Final:
Time - O(N * Klog(K))
Space - O(N * K)


Final:
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
