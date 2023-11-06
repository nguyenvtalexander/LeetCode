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
