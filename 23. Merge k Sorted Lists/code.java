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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            while(lists[i]!=null){
                l.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(l);
        ListNode head = null;
        ListNode temp = null;
        
        for(int i=0;i<l.size();i++){
            if(head==null){
                head = new ListNode(l.get(i));
                temp = head;
            }else{
                temp.next = new ListNode(l.get(i));
                temp = temp.next;
            }
        }
        return head;
    }
}