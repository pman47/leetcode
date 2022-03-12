class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int curr = 0;
        int count = 0;
        
        while(curr < n-1) {
            if(nums[curr] + curr > n-2)  { count++; break; }
            
            int max_pos = curr;  
            int max = nums[curr];
            for(int i=curr+1; i<=nums[curr]+curr && i<n; i++){
                if(max < i+nums[i]){
                    max = i+nums[i];
                    max_pos = i;
                }
            }
            curr = max_pos;
            count++;
       }
        return count;
    }
}