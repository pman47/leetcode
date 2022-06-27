<pre>
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int l = i+1,r = nums.length-1;
            while(l<r){
                int curSum = nums[i] + nums[l] + nums[r];
                if(curSum<target){
                    l++;
                }else{
                    r--;
                }
                if(Math.abs(ans-target)>Math.abs(curSum-target)){
                    ans = curSum;
                }
            }
        }
        return ans;
    }
}
</pre>
