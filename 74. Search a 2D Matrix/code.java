// Brute Force Method O(N*M)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]>target) return false;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                    return true;
                 if(matrix[i][j]>target) 
                     return false;
            }
        }
        
        return false;
    }
}

// BINARY SEARCH METHOD
// MOST EFFICIENT O(logN)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0,high = n-1,index = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][m-1]){
                index = mid;
                break;
            }
            if(matrix[mid][0]>target && matrix[mid][m-1]>target) high = mid-1;
            else low=mid+1;
        }
        if(index == -1) return false;
        low = 0;
        high = m-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[index][mid]==target) return true;
            if(matrix[index][mid]>target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}