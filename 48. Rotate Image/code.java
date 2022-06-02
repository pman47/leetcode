class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int x=0;x<matrix.length;x++){
            for(int y=0;y<matrix[0].length/2;y++){
                int temp = 0;
                temp = matrix[x][y];
                matrix[x][y] = matrix[x][matrix[0].length-1-y];
                matrix[x][matrix[0].length-1-y] = temp;
            }
        }
    }
}