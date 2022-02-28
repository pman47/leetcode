class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s=0, e=n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if ((nums[mid]<nums[0])==(target<nums[0])){
                if (target == nums[mid]) return mid;
                else if (target > nums[mid]) s=mid+1;
                else if (target < nums[mid]) e=mid-1;
            }else{
                if(target<nums[0] && nums[mid]>=nums[0]) s=mid+1;
                else e=mid-1;
            }
        }
        return -1;
    }
}