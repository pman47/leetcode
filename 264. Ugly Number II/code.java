class Solution {
    public int nthUglyNumber(int n) {
        int[]dp=new int[n];
        int tw=0,th=0,fv=0;
        dp[0]=1;
        for(int i=1;i<n;i++){
            int two=dp[tw]*2,three=dp[th]*3,five=dp[fv]*5;
            int min=Math.min(two,Math.min(three,five));
            if(min==two)tw++;
            if(min==three)th++;
            if(min==five)fv++;
            dp[i]=min;
        }
        System.out.println(Arrays.toString(dp));
        return dp[n-1]; 
    }
}