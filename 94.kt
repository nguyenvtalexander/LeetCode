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
  fun inorderTraversal(root: TreeNode?): List<Int> {
      val res = mutableListOf<Int>()
      traverse(root, res)
      return res
  }

  fun traverse(node: TreeNode?, res: MutableList<Int>) {
      if (node == null) return
      traverse(node.left, res)
      res.add(node.`val`)
      traverse(node.right, res)
  }
}
