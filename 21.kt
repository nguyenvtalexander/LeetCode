/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

/**
 * create dummy listnode and set current to dummy
 * create new mutable references to each list
 * go through and compare and append them and update the list that we appended from
 * update the current node outside of both conditionals
 * if list1 or list2 are empty, check if they aren't null and append to the end of the current
 * return dummy.next
 */

class Solution {
  fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
      val dummy = ListNode()
      var current = dummy

      var node1 = list1
      var node2 = list2

      while (node1 != null && node2 != null) {
          if (node1.`val` <= node2.`val`) {
              current.next = node1
              node1 = node1.next
          } else {
              current.next = node2
              node2 = node2.next
          }
          current = current.next
      }

      if (node1 != null) {
          current.next = node1
      } else if (node2 != null) {
          current.next = node2
      }
      return dummy.next
  }
}