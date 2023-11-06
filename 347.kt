/*
Create a hashmap to count occurences of each num
Create a min heap
add keys(value of nums) into the heap, but organize it using the map[key]
    -such that the min occurances are prioritized
as keys are added, check for the size of the heap and poll() if the size of the heap 
is larger than K
return heap as an IntArray

creating the map is O(N) time and space dependent on the input array
the size of the heap is O(M) where M is the target K
O(log(K)) for time of operations of the heap

https://interviewing.io/questions/top-k-frequent-elements

Final:
Time - O(Nlog(K))
Space - O(N * M)
 */

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        val heap = PriorityQueue<Int>(compareBy { map[it] })
        for (key in map.keys) {
            heap.offer(key)
            if (heap.size > k) {
                heap.poll()
            }
        }

        return heap.toIntArray()
    }
}
