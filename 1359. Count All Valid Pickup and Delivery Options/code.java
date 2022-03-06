class Solution {
    public int countOrders(int n) {
        long[] dp = new long[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++)
        {
            dp[i] = i*dp[i-1]*(2*i-1);
            dp[i]=dp[i]%1000000007;
        }
        return (int)dp[n];
    }
}