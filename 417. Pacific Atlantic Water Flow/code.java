class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int r = heights.length, c = heights[0].length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
		//traversing through 2d array
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                int[][] visited = new int[r][c];
                int[] arr = new int[2]; //0th index for pacific -> (0, n) or (n, 0) //1st index for atlantic -> (r-1, n) or (n, c-1)
                dfs(i, j, heights, arr, visited);
                if(arr[0] == 1 && arr[1] == 1)
                    ans.add(Arrays.asList(i, j));
            }
        }
        return ans;
    }
    
    private void dfs(int i, int j, int[][] h, int[] a, int[][] v) {
        if(a[0] == 1 && a[1] == 1) return; // if we can reach both pacific as well as atlantic ocean already
        if(i >= h.length || j >= h[0].length || i < 0 || j < 0 || v[i][j] == 1) return;
        v[i][j] = 1; // marking as visited
        if(i == 0 || j == 0) a[0] = 1; //reached pacific ocean
        if(i == h.length-1 || j == h[0].length-1) a[1] = 1; //reached atlantic ocean
        if(i+1 < h.length) {
            if(h[i][j] >= h[i+1][j])
                dfs(i+1, j, h, a, v);
        }
        if(j+1 < h[0].length) {
            if(h[i][j+1] <= h[i][j])
                dfs(i, j+1, h, a, v);
        }
        if(i-1 >= 0) {
            if(h[i-1][j] <= h[i][j])
                dfs(i-1, j, h, a, v);
        }
        if(j-1 >= 0) {
            if(h[i][j-1] <= h[i][j])
                dfs(i, j-1, h, a, v);
        }
    }
}