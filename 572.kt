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
  fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
      if (root == null) { 
          return false
      }

      if (sameTree(root, subRoot)) {
          return true
      }

      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
  }

  fun sameTree(parent: TreeNode?, sub: TreeNode?): Boolean {
      if (parent == null && sub == null) {
          return true
      }
      if (parent == null || sub == null) {
          return false
      }

      return parent.`val` == sub.`val` &&
          sameTree(parent.left, sub.left) &&
          sameTree(parent.right, sub.right)
  }
}
