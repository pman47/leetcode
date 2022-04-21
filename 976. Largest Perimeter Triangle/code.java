class Solution {
    public int largestPerimeter(int[] nums) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int v = isTrianglePossibleThenCalculatePerimeter(nums[i], nums[i+1], nums[i+2]);
            if(v > max) max = v;
        }
        return max;
    }
    public int isTrianglePossibleThenCalculatePerimeter(int s1, int s2, int s3){
        if((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2){
            return s1+s2+s3;
        }
        return 0;
    }
}