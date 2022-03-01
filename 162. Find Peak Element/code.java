class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Input nums array should not be empty.");
        if (nums.length == 1) return 0;
        return search(nums, 0, nums.length - 1);
    }
    
    private int search(int[] nums, int l, int r) {
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isPeak(nums, mid)) return mid;
            if (nums[mid] > nums[mid+1]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
     
    private boolean isPeak(int[] nums, int i) {
        return i == 0 && nums[i] > nums[i+1] ||
            i == nums.length-1 && nums[i] > nums[i-1] ||
            nums[i] > nums[i+1] && nums[i] > nums[i-1];
    }
}