/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

 class Solution {
  fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      var less: TreeNode? = null
      var more: TreeNode? = null
      if (p == null || q == null) return null
      if (p.`val` > q.`val`) {
          less = q
          more = p
      } else {
          less = p
          more = q
      }

      return helper(root, less, more)
  }

  fun helper(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      if (root == null || p == null || q == null) return null
      if (root.`val` >= p.`val` && root.`val` <= q.`val`) return root
      return if (helper(root.left, p, q) != null) helper(root.left, p, q) else helper(root.right, p, q)
  }
}

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

 class Solution {
  fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      var less: TreeNode? = null
      var more: TreeNode? = null
      if (p == null || q == null) return null
      if (p.`val` > q.`val`) {
          less = q
          more = p
      } else {
          less = p
          more = q
      }

      return helper(root, less, more)
  }

  fun helper(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
      if (root == null || p == null || q == null) return null
      if (root.`val` >= p.`val` && root.`val` <= q.`val`) return root
      val leftSearch = helper(root.left, p, q)
      return if (leftSearch != null) leftSearch else helper(root.right, p, q)
  }
}
