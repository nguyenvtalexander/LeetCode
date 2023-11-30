/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
  fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
      val dummy = ListNode(0)
      dummy.next = head

      var l: ListNode? = dummy
      var r: ListNode? = dummy

      for (i in 0..n) {
          r = r?.next
      }
      
      while (r != null) {
          l = l?.next
          r = r.next
      }

      l?.next = l?.next?.next
      return dummy.next
  }
}
