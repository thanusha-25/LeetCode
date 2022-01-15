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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode cur=root;
        while(!stack.isEmpty() || cur!=null)
        {
            while(cur!=null)
            {
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            result.add(cur.val);
            cur=cur.right;
        }
        return result;
    }
}