class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        return minimumPath(triangle, 0, 0, new Integer[n][m]);
    }
    
    private int minimumPath(List<List<Integer>> triangle, int index, int row, Integer[][] dp){
        if(row >= triangle.size()){
            return 0;
        }
        
        if(index >= triangle.get(index).size()){
            return 0;
        }
        
        if(dp[row][index] == null){
            int current = triangle.get(row).get(index);
            int sum1 = current + minimumPath(triangle, index + 1, row + 1, dp);
            int sum2 = current + minimumPath(triangle, index, row + 1, dp);

            dp[row][index] = Math.min(sum1, sum2);
        }
        
        return dp[row][index];
    }
    
}