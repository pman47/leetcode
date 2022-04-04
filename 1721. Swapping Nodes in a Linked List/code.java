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
    public ListNode swapNodes(ListNode head, int k) {
        int n = getLength(head);
        
        ListNode first = head;
        int tmp = 1;
        while(tmp<k){
            first = first.next;
            tmp++;
        }
        
        ListNode last = head;
        tmp = 1;
        
        while(tmp<=n-k){
            last = last.next;
            tmp++;
        }
        
        tmp = first.val;
        first.val = last.val;
        last.val = tmp;
        
        return head;
    }
    
    int getLength(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}