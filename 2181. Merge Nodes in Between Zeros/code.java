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
    public ListNode mergeNodes(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode list = null;
        ListNode listHead = null;
        int sum = 0;
        head = head.next;
        while(head!=null){
            sum+=head.val;
            if(head.val==0){
                if(listHead == null){
                    listHead = new ListNode(sum);
                    list = listHead;
                }else{
                    list.next = new ListNode(sum);
                    list = list.next;
                }
                sum=0;
            }
            head = head.next;
        }
        return listHead;
    }
}