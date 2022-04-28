class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeave(root);
        return sum;
    }
    int sum=0;
    void sumOfLeftLeave(TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
        }
        sumOfLeftLeave(root.left);
        sumOfLeftLeave(root.right);
    }
}