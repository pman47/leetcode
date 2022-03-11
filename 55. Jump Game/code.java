class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int[] dp = new int[nums.length];
        for (int i = 0; i <= max; i++) {
            if (i != 0) {
                dp[i] = Math.max(i + nums[i], dp[i - 1]);
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(max, dp[i]);
            if (dp[i] >= nums.length - 1) return true;
        }
        return false;
    }
}