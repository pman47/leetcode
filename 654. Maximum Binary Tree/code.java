class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums,0,nums.length-1);
    }
    
    TreeNode constructMaximumBinaryTree(int[] nums,int start,int end){
        if(start>end) return null;
        if(start==end) return new TreeNode(nums[start]);
        int index = start;
        for(int i=start;i<=end;i++){
            if(nums[i] > nums[index]) index = i;
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = constructMaximumBinaryTree(nums,start,index-1);
        root.right = constructMaximumBinaryTree(nums,index+1,end);    
        return root;
    }
}