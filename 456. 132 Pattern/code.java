class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3) 
            return false;
         int num = Integer.MIN_VALUE;
         Stack<Integer> stk = new Stack();
         for(int i = nums.length-1;i>=0;i--)
         {
            if(nums[i]<num)
                return true;
            while(!stk.isEmpty() && nums[i]>stk.peek())
            {
                num = stk.pop();
            }
            stk.push(nums[i]);
        }
        return false;
    }
}