class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int [][] dist = new int[mat.length][mat[0].length];
        for (int[] row: dist)
            Arrays.fill(row, Integer.MAX_VALUE-100000);
        
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    dist[i][j]=0;
                } else {
                    if(i>0){
                        dist[i][j] = Math.min(dist[i][j], dist[i-1][j]+1);
                    }
                    if(j>0){
                        dist[i][j] = Math.min(dist[i][j], dist[i][j-1]+1);
                    }
                }
            }
        }
        
        for(int i = mat.length-1; i>=0; i--){
            for(int j = mat[0].length-1; j>=0; j--){
                if(i<mat.length-1){
                    dist[i][j] = Math.min(dist[i][j], dist[i+1][j]+1);
                }
                if(j<mat[0].length-1){
                    dist[i][j] = Math.min(dist[i][j], dist[i][j+1]+1);
                }
            }
        }
        return dist;
    }
}