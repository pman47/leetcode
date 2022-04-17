class Solution {
    TreeNode newNode = new TreeNode(0);
    TreeNode tracker = newNode;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return root;
        
        increasingBST(root.left);
        
        tracker.right = root;
        tracker = tracker.right;
        root.left = null;
        
        increasingBST(root.right);
        return newNode.right;
    }
}