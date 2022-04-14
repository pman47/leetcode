class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        return insert(root,newNode);
    }
    
    public TreeNode insert(TreeNode root,TreeNode newNode) {
        if(root==null) return newNode;
        if(root.val < newNode.val){
            root.right = insert(root.right,newNode);
            return root;
        }
        if(root.val > newNode.val){
            root.left = insert(root.left,newNode);
            return root;
        }
        return root;
    }
}