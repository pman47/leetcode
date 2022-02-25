// Simpleeeeeeeeeeeeeeeeeeeeeeee ---------------------------------------------------------
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        
        for(int i=n-3;i>=0;i--){
            if(i==n-3) nums[i]+=nums[i+2];
            else{
                nums[i]+=Math.max(nums[i+2],nums[i+3]);
            }
        }
        System.out.println(Arrays.toString(nums));
        return Math.max(nums[0],nums[1]);
    }
}

// Using Recursion -----------------------------------------------------------------------------
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 0) return 0;
        int[] hash = new int[nums.length];
        for(int i = 0; i < hash.length; i++){
            hash[i] = -1;
        }
        int startFirstHouse = robMax(0, nums, hash);
        int startSecondHouse = robMax(1, nums, hash);
        System.out.println(Arrays.toString(hash));
        return startFirstHouse > startSecondHouse ? startFirstHouse : startSecondHouse;
    }
    
    public int robMax(int houseNumber, int[] houses, int[] hash){
        if(houseNumber >= houses.length) return 0;
        if(houseNumber >= 0 && hash[houseNumber] != -1) return hash[houseNumber];
        
        int skipCurrentHouse = robMax(houseNumber + 1, houses, hash);
        int robCurrentHouse = houses[houseNumber] + robMax(houseNumber + 2, houses, hash);
        
        hash[houseNumber] = skipCurrentHouse > robCurrentHouse ? skipCurrentHouse : robCurrentHouse;
        
        return hash[houseNumber];
    }
}