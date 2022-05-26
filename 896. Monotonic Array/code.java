class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean ans1 = true;
        boolean ans2 = true;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]) ans1 = false;
            if(nums[i]>nums[i+1]) ans2 = false;
        }
        
        return ans1 || ans2;
    }
}