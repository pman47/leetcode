class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start-(start-end)/2;
            if(nums[mid]>=nums[0]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return Math.min(nums[start],nums[0]);
    }
}

// Another Approach
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low +(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
}