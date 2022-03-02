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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        if (head != null && head.next == null) return head;
        
        if (head != null && head.next != null && head.next.next == null){
            if (head.next.val == head.val) return null;
            return head;
        }
        
        head = new ListNode(0, head);
        ListNode d = head;
        
        boolean isFirstNodeRemoved = head.val == head.next.val;
      
        while(head != null) {
            ListNode nxt = head.next;
            ListNode nxt2 = nxt != null ? nxt.next : null;
            boolean isChanged = false;
            while (nxt2 != null && nxt != null && nxt2.val == nxt.val) {
                isChanged = true;
                nxt = nxt.next;
            }
            head.next = nxt;
            if (!isChanged) head = head.next;
        }
        return d.next;
    }
}