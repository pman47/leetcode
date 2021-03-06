class Solution {
    public int climbStairs(int n) {
        return climb(n,new int[n+1]);
    }
    
    public int climb(int n,int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        
        if(dp[n]>0) return dp[n];
        
        int ans = climb(n-1,dp) + climb(n-2,dp);
        dp[n]=ans;
        
        return dp[n];
    }
}