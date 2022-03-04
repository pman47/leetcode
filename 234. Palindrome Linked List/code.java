/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        ListNode temp=head;
        Stack<Integer> stack=new Stack();
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        while(!stack.isEmpty()){
            if(head.val!=stack.pop()) return false;
            head=head.next;
        }
        return true;
    }
}