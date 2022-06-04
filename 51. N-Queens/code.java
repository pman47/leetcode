class Solution {
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(arr[i],'.');
        
        dfs(arr,0,n);
        
        return ans;
    }
    
    void dfs(char[][] arr,int row,int n){
        if(row==n) {
            ans.add(makeArrayList(arr,n));
            return;
        }
        
        for(int col = 0;col<n;col++){
            if(isValid(row,col,arr,n)){
                arr[row][col] = 'Q';
                dfs(arr,row+1,n);
                arr[row][col] = '.';
            }
        }
    }
    
    boolean isValid(int row,int col,char[][] arr,int n){
        for(int i=0;i<row;i++){
            if(arr[i][col] == 'Q') return false;
        }
        
        for(int i=0;i<col;i++){
            if(arr[row][i] == 'Q') return false;
        }
        
        int i=row,j=col;
        while(i>=0 && j>=0){
            if(arr[i][j]=='Q') return false;
            i--;j--;
        }
        
        i=row;j=col;
        while(i>=0 && j<n){
            if(arr[i][j]=='Q') return false;
            i--;j++;
        }
        
        return true;
    }
    
    List<String> makeArrayList(char[][] arr,int n){
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder s = new StringBuilder();
            for(int j=0;j<n;j++){
                s.append(arr[i][j]);
            }
            list.add(s.toString());
        }
        return list;
    }
    
}