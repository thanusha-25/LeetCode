/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=height(root.left)+1;
        int right=height(root.right)+1;
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
         if (isBalanced(root.left)&&isBalanced(root.right))
         {
             if(Math.abs(height(root.left)-height(root.right))<=1)
                 return true;
         }
        return false;
    }
}