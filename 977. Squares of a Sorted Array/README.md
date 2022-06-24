<pre>
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0,r = nums.length-1,k = nums.length-1;
        int[] ans = new int[nums.length];
        while(k>=0){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[k--] = nums[l]*nums[l++];
            }else{
                ans[k--] = nums[r]*nums[r--];
            }
        }
        return ans;
    }
}
</pre>
