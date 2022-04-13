class Solution {
    public int[][] generateMatrix(int n) {
        int uprow = 0;
        int fill = 1;
        int brow = n - 1;
        int lcol = 0;
        int rcol = n - 1;
        int[][] ans = new int[n][n];
        while(true) {
            boolean check = false;
            for(int i = lcol; i <= rcol; i++) {
                ans[uprow][i] = fill;
                fill++;
                check = true;
            }
            uprow++;
            for(int i = uprow; i <= brow; i++) {
                ans[i][rcol] = fill;
                fill++;
                check = true;
            }
            rcol--;
            for(int i = rcol; i >= lcol; i--) {
                ans[brow][i] = fill;
                fill++;
                check = true;
            }
            brow--;
            for (int i = brow; i >= uprow; i--) {
                ans[i][lcol] = fill;
                fill++;
                check = true;
            }
            lcol++;
            if (!check) {
                break;
            } 
        }
        return ans;
    }
}