<pre>
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int ans = 1,currsum=0,presum=0;
        for(int i=1;i<nums.length;i++){
            presum = currsum;
            currsum = nums[i] - nums[i-1];
            if(currsum>0){
                currsum=1;
            }else if(currsum<0){
                currsum = -1;
            }else{
                currsum = presum;
            }
            if(currsum!=presum) ans++;
        }
        return ans;
    }
}
</pre>
