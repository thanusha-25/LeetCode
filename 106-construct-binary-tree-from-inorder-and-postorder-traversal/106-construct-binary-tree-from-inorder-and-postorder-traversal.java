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
    public TreeNode build(int[] inorder,int[] postorder,int inStart,int inEnd,int postStart,int postEnd, HashMap<Integer,Integer> inOrderMap)
    {
        if(inStart>inEnd || postStart>postEnd)
            return null;
        int rootVal=postorder[postEnd];
        int rootValIndex=inOrderMap.get(rootVal);
        int rightTree=rootValIndex-inStart;
        TreeNode root=new TreeNode(rootVal);
        root.left=build(inorder,postorder,inStart,rootValIndex-1,postStart,postStart+rightTree-1,inOrderMap);
        root.right=build(inorder,postorder,rootValIndex+1,inEnd,postStart+rightTree,postEnd-1,inOrderMap);
        return root;
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> inOrderMap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            inOrderMap.put(inorder[i],i);
        }
        TreeNode root=build(inorder,postorder,0,inorder.length-1,0,postorder.length-1,inOrderMap);
        return root;
    }
}