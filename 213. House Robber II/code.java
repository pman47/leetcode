class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        int n = nums.length;
        
        return Math.max(find_max(nums, 0, n - 1) ,find_max(nums, 1, n));
    }
    
    public int find_max(int[] nums, int start, int end)
    {
        int prev = 0;
        int curr = 0;
        
        for(int i = start ; i < end ; i++)
        {
            int temp = Math.max(curr, nums[i] + prev);
            
            prev = curr;
            curr = temp;
        }
        
        return curr;
    }
}