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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> queue=new ArrayDeque<TreeNode>();
        TreeNode null1=new TreeNode(-1001);
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        queue.push(root);
        queue.addLast(null1);
        TreeNode cur=queue.removeFirst();
        List<Integer> list=new ArrayList<Integer>();
        list.add(root.val);
        result.add(list);
        list=new ArrayList<Integer>();
        int reverse=1;
        while(!queue.isEmpty()&& cur!=null)
        {
            if(cur.left!=null)
            {
                queue.addLast(cur.left);
                list.add(cur.left.val);
            }
            if(cur.right!=null)
            {
                queue.addLast(cur.right);
                list.add(cur.right.val);
            }
            cur=queue.removeFirst();
            if(cur==null1)
            {
                if(reverse==1)
                {
                    Collections.reverse(list);
                }
                if(list.size()>0)
               result.add(list);
                list=new ArrayList<Integer>();
               reverse=reverse^1;
               queue.addLast(null1);
               cur=queue.removeFirst();
            }
        }
        return result;
    }
}