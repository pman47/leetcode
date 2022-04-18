class Solution {
    int count=0,result=-1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result;
    }
    void inorder(TreeNode root,int k){
        if(root==null) return;
        inorder(root.left,k);
        count++;
        if(count==k){
            result = root.val;
            return;
        }
        inorder(root.right,k);
    }
}