class Solution {
    private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}};
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length,m = grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1) return -1;
        if(n==1 && m==1) return 1;
        
        int depth = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        grid[0][0] = -1;
        
        while(!queue.isEmpty()){
            depth++;
            int size = queue.size();
            while(size-- > 0){
                int[] cell = queue.poll();
                for(int[] dir : DIRS){
                    int x = cell[0] + dir[0];
                    int y = cell[1] + dir[1];
                    if(isValid(x,y,n,m) || grid[x][y]!=0) continue;
                    if(x==n-1 && y==m-1) return depth;
                    queue.add(new int[]{x,y});
                    grid[x][y]=-1;
                }
            }
        }
        
        
        
        return -1;
    }
    
    boolean isValid(int i,int j,int n,int m){
        return i<0||j<0||i>=n||j>=m;
    }
    
}