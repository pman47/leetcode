class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int max=nums[0];
        for(int i:nums)
          max=Math.max(max,i);
         
        int hash[]=new int[max+1];    
                
        for(int i:nums)
            hash[i]+=i;
        
        int exclude=0;
        int include=hash[0];
            
        for(int i=1;i<max+1;i++){
            int ex=exclude;
            exclude=Math.max(exclude,include);
            include=ex+hash[i];
        }
        
        return Math.max(include,exclude);
    }
}