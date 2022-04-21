class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++) insert(root,preorder[i]);
        return root;
    }
    
    TreeNode insert(TreeNode root,int value){
        if(root==null) return new TreeNode(value);
        if(root.val>value) root.left = insert(root.left,value);
        if(root.val<value) root.right = insert(root.right,value);
        return root;
    }
}