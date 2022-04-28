class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int sum = 0;
        int n = list.size();
        for(int i=0;i<n;i++){
            sum=sum + (int)Math.pow(2,i)*list.get(n-i-1);
        }
        return sum;
    }
}