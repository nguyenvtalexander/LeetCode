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
  fun reorderList(head: ListNode?): Unit {
      if (head?.next == null) return

      var p1 = head
      var p2 = head
      while (p1?.next != null && p2?.next?.next != null) {
          p1 = p1.next
          p2 = p2.next.next
      }

      var mid = p1?.next
      p1?.next  = null

      var cur = mid
      var prev: ListNode? = null
      while (cur != null) {
          val temp = cur?.next
          cur?.next = prev
          prev = cur
          cur = temp
      }
      
      var first = head
      var second = prev
      while (first != null && second != null) {
          val tempFirst = first?.next
          val tempSecond = second.next

          first?.next = second
          second.next = tempFirst

          first = tempFirst
          second = tempSecond
      }
  }
}
