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
    val res = mutableListOf<List<Int>>()
    if (root == null) return res
    val que = ArrayDeque<TreeNode>()
    que.add(root)

    while (!que.isEmpty()) {
        val level = mutableListOf<Int>()
        for (i in que.indices) {
            val node = que.removeFirst()
            level.add(node.`val`)
            if (node.left != null) que.add(node.left)
            if (node.right != null) que.add(node.right)
        }
        res.add(level)
    }
    return res
  }
}