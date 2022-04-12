class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ans = 0;
                if(i+1<n && board[i+1][j]==1) ans++;
                if(i-1>=0 && board[i-1][j]==1) ans++;
                if(j+1<m && board[i][j+1]==1) ans++;
                if(j-1>=0 && board[i][j-1]==1) ans++;
                if(i+1<n && j+1<m && board[i+1][j+1]==1) ans++;
                if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1) ans++;
                if(i-1>=0 && j+1<m && board[i-1][j+1]==1) ans++;
                if(i+1<n && j-1>=0 && board[i+1][j-1]==1) ans++;
                if(board[i][j]==1){
                    if(ans<2 || ans>3) arr[i][j]=0;
                    else arr[i][j]=1;
                }else{
                    if(ans==3) arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++) board[i][j] = arr[i][j];
    
    }
}