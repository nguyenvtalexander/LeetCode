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
  fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
      return traverse(root, 0, targetSum)
  }

  fun traverse(node: TreeNode?, runningSum: Int, targetSum: Int): Boolean {
      if (node == null) return false
      
      val sum = runningSum + node.`val`
      if (node.left == null && node.right == null) {
          if (sum == targetSum) return true
      }

      return traverse(node.left, sum, targetSum) || traverse(node.right, sum, targetSum)
  }
}
