class Solution {
    public int[] twoSum(int[] a, int target) {
        int p1 = 0;
        int p2 = a.length-1;
        while(p1 <= p2) {
            int n = a[p1] + a[p2];
            if(n == target) {
                int[] ans = {p1+1, p2+1};
                return ans;
            } else if(target < n) {
                p2--;
            } else {
                p1++;
            }
        }
        return a;
    }
}
