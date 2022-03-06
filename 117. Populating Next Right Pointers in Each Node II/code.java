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
        Deque<Node> queue=new ArrayDeque<>();
        if(root==null)
            return root;
        queue.add(root);
        bfs(queue);
        return root;
    }
    
    public void bfs(Deque<Node> queue){    
        while(!queue.isEmpty()){
            int s=queue.size();
            Node curr=null;
            for(int i=0;i<s;i++){
                Node prev=curr;
                curr=queue.removeFirst();
                if(prev!=null)
                    prev.next=curr;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
        }
    }
}