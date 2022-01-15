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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        if(root==null)
            return result;
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode cur=stack.pop();
            result.add(cur.val);
            if(cur.left!=null)
                stack.push(cur.left);
            if(cur.right!=null)
                stack.push(cur.right);
        }
        Collections.reverse(result);
        return result;
    }
}