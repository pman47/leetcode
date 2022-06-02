class Solution {
    int n;
    public boolean findRotation(int[][] mat, int[][] target) {
        n = mat.length;
        if(same(mat,target)) return true;
        for(int x=0;x<4;x++){
            change90deg(mat);
            if(same(mat,target)) return true;
        }
        
        return false;
        
    }
    
    void change90deg(int[][] a){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = 0;
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
        for(int x=0;x<n;x++){
            for(int y=0;y<n/2;y++){
                int temp = 0;
                temp = a[x][y];
                a[x][y] = a[x][a[0].length-1-y];
                a[x][a[0].length-1-y] = temp;
            }
        }
    }
    
    boolean same(int[][] a,int[][] b){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]) return false;
            }
        }
        return true;
    }
    
}