/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 * 
 * This is a good problem to practice both two pointers/swapping and recursive solutions
 */
class Solution {
  fun reverseList(head: ListNode?): ListNode? {
      var prev: ListNode? = null
      var cur = head
      while (cur != null) {
          val temp = cur.next
          cur.next = prev
          prev = cur
          cur = temp
      }
      return prev
  }
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 * 
 * Recursive solution 
 */

class Solution {
  fun reverseList(head: ListNode?): ListNode? {
      if (head == null || head.next == null) {
          return head
      }

      val newHead = reverseList(head.next)
      head.next?.next = head
      head.next = null

      return newHead
  }
}
