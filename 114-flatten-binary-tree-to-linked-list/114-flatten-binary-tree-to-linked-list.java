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
    public void flat(TreeNode root)
    {
        if(root==null || (root.left==null && root.right==null))
            return ;
        flat(root.left);
        flat(root.right);
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.left=null;
        root.right=left;
        while(root.right!=null)
            root=root.right;
        root.right=right;
        return ;
    }
    public void flatten(TreeNode root) {
      flat(root);   
    }
}