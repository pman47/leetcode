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
    public ListNode rotateRight(ListNode head, int k) {
         if(head == null) return null;
         int size = size(head);
         if(head != null && head.next == null || (k  % size == 0 || k == size)) 
             return head;
    
        if(k > size) k = k % size;
        ListNode last = getLastNode(head, size - k);
        ListNode newHead = last.next;
        ListNode lastNodeOfTheList = getLastNode(newHead, size);
        last.next = null;
        lastNodeOfTheList.next = head;
        head = newHead;
        
        return head;  
    }
    public ListNode getLastNode(ListNode head, int k){
        int count = 0;
        ListNode last = null;
        while(head != null && count < k){
            last = head;
            head = head.next;
            count++;
        }
        return last;
    }
   
    public int size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}