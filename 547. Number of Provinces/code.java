class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j] == 1){
                    System.out.println(i + " " + j);
                    ans++;
                    dfs(i,j,n,isConnected);
                }
            }
        }
        return ans;
    }
    
    void dfs(int r, int c , int n, int[][] g) {
        if (r<0 || c<0 || c >= n || r >= n || g[r][c] == 0) return;
        g[r][c] = 0;
        for(int i=0; i<g.length;i++) {
            dfs(r, i ,n ,g);
            dfs(i, c ,n ,g);
        }
    }
}