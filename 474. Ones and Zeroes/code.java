class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String s: strs){
            int z=0;
            int o=0;
            for(char c: s.toCharArray()){
                if(c=='1') o++;
                else z++;
            }
            for(int i=m;i>=z;i--){
                for(int j=n;j>=o;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-z][j-o]+1);
                }
            }
        }
        return dp[m][n];
        
    }
}