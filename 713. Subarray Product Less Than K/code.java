class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k < 2)
            return 0;
        int prod = 1, i = 0, j = 0, answer = 0;
        while(j < nums.length){
            prod = prod * nums[j];
            while(prod >= k){
                prod = prod / nums[i++];
            }
            answer = answer + (j-i+1);
            j++;
        }
        return answer;
    }
}