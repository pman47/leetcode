class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next == null ? fast.next : fast.next.next;
        }
        
        return slow;
    }
}