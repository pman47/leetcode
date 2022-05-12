class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        getSum(root,0);
        return sum;
    }
    
    void getSum(TreeNode root,int curSum){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            sum+=((curSum*10)+root.val);
            return;
        }
        curSum *= 10;
        getSum(root.left,curSum+root.val);
        getSum(root.right,curSum+root.val);
    }
}