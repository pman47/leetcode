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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next == null) return head;
        ListNode list1 = null;
        ListNode list1Head = null;
        
        ListNode list2 = null;
        ListNode list2Head = null;
        
        while(head!=null){
            if(head.val < x){
                if(list1Head==null){
                    list1Head = new ListNode(head.val);
                    list1 = list1Head;
                }else{
                    list1.next = new ListNode(head.val);
                    list1 = list1.next;
                }
            }else{
                if(list2Head==null){
                    list2Head = new ListNode(head.val);
                    list2 = list2Head;
                }else{
                    list2.next = new ListNode(head.val);
                    list2 = list2.next;
                }
            }
            head=head.next;
        }
        if(list1!=null){
            list1.next = list2Head;
        }else{
            return list2Head;
        }
        
        return list1Head;
    }
}