class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        List<List<Integer>> result = new ArrayList<>();
        
        int dim = rows * cols;
        
        k %= dim;
        
        int index_1D = dim - k;
        for (int i = 0; i < rows; ++i) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < cols; ++j) {
                int r = (index_1D % dim) / cols;
                int c = (index_1D % dim) % cols;
                temp.add(grid[r][c]);
                index_1D++;
            }
            result.add(temp);
        }
        return result;
    }
}