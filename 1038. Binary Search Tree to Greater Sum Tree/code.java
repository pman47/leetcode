class Solution {
    public TreeNode bstToGst(TreeNode root) {
        inOrder(root);
        return root;
    }
    
    int count=0;
    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.right);
        root.val += count;
        count = root.val;
        inOrder(root.left);
    }
    
}