```
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums) pq.add(i);

        int prev = pq.remove(),ans = 1,count = 1;
        while(!pq.isEmpty()){
            int now = pq.remove();
            if(now==prev){
                // Do nothing
            }else if(now == prev+1){
                count++;
            }else if(now != prev+1){
                count = 1;
            }
            ans = Math.max(ans,count);
            prev = now;
        }
        return ans;
    }
}
```
