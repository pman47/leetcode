class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> queue = new Stack<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.pop();
            list.add(tmp.val);
            if(tmp.right!=null) queue.add(tmp.right);
            if(tmp.left!=null) queue.add(tmp.left);
        }
        return list;
    }
}