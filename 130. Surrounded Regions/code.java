class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0; i < row; i++){
            if(board[i][0] == 'O')
                dfs(i, 0, board);
            if(board[i][col-1] == 'O')
                dfs(i, col-1, board);
        }
        
        for(int j = 0; j < col; j++){
            if(board[0][j] == 'O')
                dfs(0, j, board);
            if(board[row-1][j] == 'O')
                dfs(row-1, j, board);
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                if(board[i][j] == 'A')
                    board[i][j] = 'O';
            }
        }
    }
    
    private static void dfs(int r, int c, char[][] board){
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length)
            return;
        if(board[r][c] != 'O')
            return;
        board[r][c] = 'A';
        dfs(r+1, c, board);
        dfs(r-1, c, board);
        dfs(r, c+1, board);
        dfs(r, c-1, board);
    }
}