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
  fun maxDepth(root: TreeNode?): Int {
      if (root == null) {
          return 0
      }
      return max(maxDepth(root.left), maxDepth(root.right)) + 1
  }
}

class Solution {
  fun maxDepth(root: TreeNode?): Int {
    var count = 0
    val queue = mutableListOf<TreeNode>()
    
    if (root != null) {
        queue.add(root)
    }
    while (!queue.isEmpty()) {
        count += 1
        for (i in 0..queue.lastIndex) {
            val cur = queue.removeAt(0)
            if (cur.left != null) {
                queue.add(cur.left)
            } 
            if (cur.right != null) {
                queue.add(cur.right)
            }
        }
    }
    
    return count
  }
}