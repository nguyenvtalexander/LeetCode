/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
  fun searchBST(root: TreeNode?, target: Int): TreeNode? {
      var cur = root

      while (cur != null) {
          val curVal = cur?.`val`
          if (curVal == target) {
              return cur
          } else if (curVal != null && curVal > target) {
              cur = cur.left
          } else {
              cur = cur.right
          }
      }
      return null
  }
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

/*

 */
class Solution {
    fun searchBST(root: TreeNode?, target: Int): TreeNode? {
        var cur = root
        while (cur != null) {
            when {
                cur.`val` == target -> return cur
                cur.`val` < target -> cur = cur.right
                cur.`val` > target -> cur = cur.left
            }
        }
        return cur
    }
}

