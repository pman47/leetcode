class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        int j = nums2.length - 1;
        for (int i = nums1.length - 1; i != -1; i--) {
            while (j >= i && nums2[j] < nums1[i])
                j--;
            res = Math.max(res, j - i);
        }
        return res;
    }
}