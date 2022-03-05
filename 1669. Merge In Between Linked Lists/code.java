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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode first = list1;
        while(a>1){
            first=first.next;
            a--;
            b--;
        }
        
        ListNode second = first;
        while(b>0){
            second = second.next;
            b--;
        }
        
        first.next = list2;
        while(list2.next!=null) list2=list2.next;
        
        list2.next=second.next;
        return list1;
    }
}