class Solution {
    public int countNegatives(int[][] a) {
        int n=a.length,m = a[0].length;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            if(a[i][m-1]<0){
                int index = m;
                int low = 0;
                int high = m-1;
                while(low<=high){
                    int mid = low+(high-low)/2;
                    if(a[i][mid]<0){
                        index = mid;
                        high=mid-1;
                    }else{
                        low = mid+1;
                    }
                }
                if(index!=m){
                    ans+=(m-index);
                }
            }
        }
        
        return ans;
    }
}