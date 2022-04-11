class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(mid!=i && arr[mid] == arr[i]*2) return true;
                if(arr[mid] < arr[i]*2) start=mid+1;
                else end = mid-1;
            }
        }
        return false;
    }
}