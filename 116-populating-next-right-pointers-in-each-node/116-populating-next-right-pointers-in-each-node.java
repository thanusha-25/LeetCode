/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Deque<Node> queue=new ArrayDeque<Node>();
        Node null1=new Node(-1001);
        if(root==null)
            return root;
        queue.addLast(root);
        queue.addLast(null1);
        Node cur=queue.removeFirst();
        while(!queue.isEmpty() && cur!=null1)
        {
            if(cur.left!=null)
            {
                Node tmp=queue.getLast();
                if(tmp!=null1)
                tmp.next=cur.left;
                queue.addLast(cur.left);
            }
            if(cur.right!=null)
            {
                Node tmp=queue.getLast();
                if(tmp!=null1)
                tmp.next=cur.right;
                queue.addLast(cur.right);
            }
            cur=queue.removeFirst();
            if(cur==null1)
            {
                queue.addLast(null1);
                cur=queue.removeFirst();
            }
        }
        return root;
    }
}