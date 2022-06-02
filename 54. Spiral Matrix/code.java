class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int layer = 0,row=0,col=0;
        while(result.size() < m*n) {
            while(result.size() < m*n && col <= n-layer-1) result.add(matrix[row][col++]);
            row++;col--;
            while(result.size() < m*n && row <= m-layer-1) result.add(matrix[row++][col]);
            col--;row--;
            while(result.size() < m*n && col >= layer) result.add(matrix[row][col--]);
            row--;col++;layer++;
            while(result.size() < m*n && row >= layer) result.add(matrix[row--][col]);
            col++;row++;
        }
        return result;
    }
}