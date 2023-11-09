/**
 * Kind of a strange worded question. There are problably better queue problems out there
 * weird I have to import the ArrayDeque as well
 */

import java.util.ArrayDeque

class RecentCounter() {
    val queue = ArrayDeque<Int>()
    
    fun ping(t: Int): Int {
        queue.offer(t)
        while (queue.peek() < t - 3000) {
            queue.poll()
        }
        return queue.size
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
 */
