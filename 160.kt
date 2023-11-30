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
  fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
      var list1 = headA
      var list2 = headB
      if (list1 == null || list2 == null) return null
      val set = HashSet<ListNode>()

      while (list1 != null) {
          set.add(list1)
          list1 = list1.next
      }

      while (list2 != null) {
          if (!set.add(list2)) return list2
          list2 = list2.next
      }
      return null
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
 */

 class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var pointerA = headA
        var pointerB = headB

        var lenA = 0
        var lenB = 0

        var tempA = headA
        while (tempA != null) {
            lenA++
            tempA = tempA.next
        }

        var tempB = headB
        while (tempB != null) {
            lenB++
            tempB = tempB.next
        }

        while (lenA > lenB) {
            pointerA = pointerA?.next
            lenA--
        }

        while (lenB > lenA) {
            pointerB = pointerB?.next
            lenB--
        }

        while (pointerA != pointerB) {
            pointerA = pointerA?.next
            pointerB = pointerB?.next
        }

        return pointerA
    }
}
