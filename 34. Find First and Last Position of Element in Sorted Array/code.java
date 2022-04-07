class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>=target) end=mid-1;
            else start=mid+1;
        }
        if(start>=nums.length || nums[start]!=target) return new int[]{-1,-1};
        int first = start;
        end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]==target) start = mid+1;
            else end = mid-1;
        }
        return new int[]{first,end};
    }
}