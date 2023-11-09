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
  fun levelOrder(root: TreeNode?): List<List<Int>> {
      val res = mutableListOf<MutableList<Int>>()
      if (root == null) return res

      val que = ArrayDeque<TreeNode?>()
      que.add(root)
      
      while(!que.isEmpty()) {
          val levelSize = que.size
          val level = mutableListOf<Int>()

          for (i in 0..levelSize - 1) {
              val node = que.removeFirst()
              if (node != null) level.add(node.`val`)
              node?.left?.let { que.add(it) }
              node?.right?.let { que.add(it) }
          }
          res.add(level)
      }
      return res
  }
}
