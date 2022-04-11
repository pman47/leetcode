class Solution {
    public void moveZeroes(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++){
			if(index==-1 && nums[i]==0) index = i;

            if (nums[i] != 0 && index!=-1){
                nums[index] = nums[i];
				nums[i]=0;
				index++;
			}
		}
    }
}