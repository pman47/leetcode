class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums==null||nums.length<=0)
            return 0;
        int n=nums.length;
        int len=n+1,currSum=0;
        int start=0,end=0;
        while(end<n) {
            currSum+=nums[end++];
            while(currSum>=target && start<end) {
                if(end-start<len) {
                    len=end-start;
                }
                currSum-=nums[start++];
            }
        }
        return len==n+1?0:len;
    }
}