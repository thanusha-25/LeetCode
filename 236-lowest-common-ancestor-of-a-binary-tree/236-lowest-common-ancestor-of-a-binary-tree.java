/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lca(TreeNode root,int value1,int value2)
    {
        if(root==null)
            return null;
        if(root.val==value1 || root.val==value2)
            return root;
        TreeNode left=lca(root.left,value1,value2);
        TreeNode right=lca(root.right,value1,value2);
        if(left!=null && right!=null)
            return root;
        if(left!=null)
            return left;
        return right;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==p || root==q)
           return root;
        return lca(root,p.val,q.val);
    }
}