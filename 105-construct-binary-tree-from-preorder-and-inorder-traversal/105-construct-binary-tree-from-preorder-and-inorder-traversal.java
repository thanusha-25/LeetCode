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
    public TreeNode build(int[] preorder,int[] inorder, int preStart,int preEnd,int inStart,int inEnd,HashMap<Integer,Integer> inorderMap)
    {
        if(preStart>preEnd || inStart>inEnd)
            return null;
        int rootVal=preorder[preStart];
        int rootIndex=inorderMap.get(rootVal);
        TreeNode root=new TreeNode(rootVal);
        int leftTree=rootIndex-inStart;
        root.left=build(preorder,inorder,preStart+1,preStart+leftTree,inStart,rootIndex-1,inorderMap);
        root.right=build(preorder,inorder,preStart+leftTree+1,preEnd,rootIndex+1,inEnd,inorderMap);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inorderMap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            inorderMap.put(inorder[i],i);
        }
        TreeNode tree=build(preorder,inorder,0,preorder.length-1,0,inorder.length-1,inorderMap);
        return tree;
    }
}