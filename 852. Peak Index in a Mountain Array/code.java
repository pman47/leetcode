class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                e=mid;
            }
        }
        return e;
    }
}



// AGAIN
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l<h){
            int m = l + (h-l)/2;
            if(arr[m]<arr[m+1]){
                l=m+1;
            }else{
                h=m;
            }
        }
        return l;
    }
}