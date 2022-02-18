class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode tmp = head;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        n=len-n;
        if(n==0) return head.next;
        
        tmp = head;
        while(n>1){
            tmp=tmp.next;
            n--;
        }
        tmp.next=tmp.next.next;
        return head;
    }
}