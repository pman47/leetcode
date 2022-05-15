// DFS SOLUTION, RECURSIVE
class Solution {
    int sum = 0;
    int maxLevel = -1;
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root, 0);
        return sum;
    }
    
    void dfs(TreeNode root, int level){
        
        if(root.left == null && root.right == null){
            if(maxLevel < level){
                sum = root.val;
                maxLevel = level;
            } else if(maxLevel == level){
                sum += root.val;
            }
            return;
        }
        
        if(root.left != null){
            dfs(root.left, level+1);
        }
        
        if(root.right != null){
            dfs(root.right, level+1);
        }
    }
}

// LEVEL ORDER TRAVERSAL SOLUTION
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