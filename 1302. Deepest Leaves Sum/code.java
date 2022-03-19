/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        int realsum = 0;
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node==null){
                if(!q.isEmpty()) q.add(null);
                sum=0;
                continue;
            }
            sum+=node.val;
            realsum = sum;
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        return realsum;
    }
}