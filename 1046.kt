class Solution {
  fun lastStoneWeight(stones: IntArray): Int {
      val heap = PriorityQueue<Int>(Comparator.reverseOrder())
      stones.forEach {
          heap.offer(it)
      }

      while (heap.size > 1) {
          val stone1 = heap.poll()
          val stone2 = heap.poll()
          when {
              stone1 > stone2 -> heap.offer(stone1 - stone2)
              stone1 < stone2 -> heap.offer(stone2 - stone1)
          }
      }

      if (heap.size == 1) return heap.peek()
      return 0
  }
}
