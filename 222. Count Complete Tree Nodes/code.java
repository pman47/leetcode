class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}