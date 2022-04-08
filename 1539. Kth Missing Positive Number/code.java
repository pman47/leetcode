class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int mValue = arr[m] - m - 1;
            if(mValue >= k) {
                r = m - 1;
            } else if(mValue < k) {
                l = m + 1;
            }
        }
        return k + l;
    }
}