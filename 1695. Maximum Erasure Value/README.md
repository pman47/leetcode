<pre>
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int sum=nums[0];
        int currSum=nums[0];
        int j=0;
        for(int i=1;i<nums.length;i++){
            while(set.contains(nums[i])){
                currSum-=nums[j];
                set.remove(nums[j++]);
            }
            set.add(nums[i]);
            currSum+=nums[i];
            sum=Math.max(sum,currSum);
        }
        sum=Math.max(sum,currSum);
        return sum;
    }
}
</pre>
