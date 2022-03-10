class Solution {
    public boolean exist(char[][] b, String w) {
        char[] wc = w.toCharArray();
        int[][] v = new int[b.length][b[0].length];
        for(int i=0; i < b.length; i++) {
            for(int j=0; j<b[0].length; j++) {
                if(b[i][j]==w.charAt(0)){
                    if (dfs(i, j, b.length, b[0].length, b, 0, wc, v)) return true;
                }
            }
        }
        return false;
    }
    
    
    boolean dfs(int r, int c, int n, int m, char[][] b, int idx, char[] w, int[][] v) {
        if (r < 0 || c < 0 || r > n-1 || c > m-1 || v[r][c] == 1 || b[r][c] != w[idx]) return false;
        if (idx == w.length-1 && b[r][c] == w[idx]) return true;
        
        v[r][c] = 1;
        boolean val = dfs(r+1, c, n, m, b, idx+1, w, v) || dfs(r-1, c, n, m, b, idx+1, w, v) || dfs(r, c+1, n, m, b, idx+1, w, v) || dfs(r, c-1, n, m, b, idx+1, w, v);
        v[r][c] = 0;
        return val;
    }
    
}