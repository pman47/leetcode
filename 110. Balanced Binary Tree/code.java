class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.abs(right-left) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int getHeight(TreeNode root){
        if(root==null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    
}