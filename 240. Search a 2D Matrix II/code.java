class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target && matrix[i][m-1]>=target){
                int start = 0;
                int end = m-1;
                while(start<=end){
                    int mid = start+(end-start)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(matrix[i][mid]>target){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
        }
        return false;
    }
}


// Another Easy Approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int row = matrix.length -1;
        int column = matrix[0].length-1;
        int c = 0;
        
      while(row>=0 && c<=column)
      {
        if(matrix[row][c] == target)
            return true;
          else if(matrix[row][c]> target)
              row = row-1;
          else
              c = c+1;
      }
        return false;
    }
}