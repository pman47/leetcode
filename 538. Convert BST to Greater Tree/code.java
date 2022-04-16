class Solution {
    int greaterValue = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return null; // Base Case
        
        // InOrder Traversal
        convertBST(root.right);
        root.val += greaterValue;
        greaterValue = root.val;
        convertBST(root.left);
        
        return root;
    }
}