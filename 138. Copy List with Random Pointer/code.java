/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newNodeHead = null;
        Node newNode = null;
        Node temp = head;
        
        HashMap<Node,Node> map = new HashMap<>();
        
        while(temp!=null){
            if(newNodeHead == null){
                newNodeHead = new Node(temp.val);
                newNode = newNodeHead;
                map.put(temp,newNodeHead);
            }else{
                newNode.next = new Node(temp.val);
                newNode = newNode.next;
                map.put(temp,newNode);
            }
            temp = temp.next;
        }
        
        newNode = newNodeHead;
        temp = head;
        while(temp!=null){
            Node tt = map.get(temp.random);
            
            newNode.random = tt;
            
            newNode = newNode.next;    
            temp = temp.next;
        }
        
        return newNodeHead;
    }
}