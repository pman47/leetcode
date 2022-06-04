class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int m = l.length;
        for(int i=0;i<m;i++){
            ans.add(check(nums,l[i],r[i]));
        }
        return ans;
    }
    
    boolean check(int[] arr,int left,int right){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=left;i<=right;i++) pq.add(arr[i]);
        
        int a;
        int b = pq.remove();
        int c = pq.remove();
        while(!pq.isEmpty()){
            a=b;
            b=c;
            c=pq.remove();
            if(a-b != b-c) return false;
        }
        return true;
    }
    
}