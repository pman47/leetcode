class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length,m=grid[0].length,ans=0;
        
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                dfs(grid,0,i,n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                dfs(grid,i,0,n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][m-1]==1){
                dfs(grid,i,m-1,n,m);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[n-1][i]==1){
                dfs(grid,n-1,i,n,m);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
    
    void dfs(int[][] grid,int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0) return;
        grid[i][j]=0;
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
    }
}