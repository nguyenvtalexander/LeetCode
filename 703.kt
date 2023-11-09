/**
 * this solution is faster
 */
class KthLargest(val k: Int, nums: IntArray) {
  val heap = PriorityQueue<Int>(k)
  
  init {
      nums.forEach {
          add(it)
      }
  }

  fun add(`val`: Int): Int {
      heap.offer(`val`)
      if (heap.size > k) heap.poll()
      return heap.peek()
  }
}

/**
* Your KthLargest object will be instantiated and called as such:
* var obj = KthLargest(k, nums)
* var param_1 = obj.add(`val`)
*/

class KthLargest(k: Int, nums: IntArray) {
  val heap = PriorityQueue<Int>(nums.toList())
  val k = k

  fun add(`val`: Int): Int {
      heap.offer(`val`)
      while (heap.size > k) {
          heap.poll()
      }
      return heap.peek()
  }
}

/**
* Your KthLargest object will be instantiated and called as such:
* var obj = KthLargest(k, nums)
* var param_1 = obj.add(`val`)
*/