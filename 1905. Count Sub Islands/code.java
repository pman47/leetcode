class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length,m = grid1[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j] == 1){
                    if(dfs(grid1,grid2,i,j,n,m)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    
    boolean dfs(int[][] a,int[][] b,int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m||b[i][j]==0) return true;
        if(a[i][j]!=b[i][j]) return false;
        b[i][j]=0;
        a[i][j]=0;
        boolean w = dfs(a,b,i+1,j,n,m);
        boolean x = dfs(a,b,i,j+1,n,m);
        boolean y = dfs(a,b,i-1,j,n,m);
        boolean z = dfs(a,b,i,j-1,n,m);
        return w&&x&&y&&z;
    }
}