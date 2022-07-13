```
class Solution {
    List<List<Integer>> levels = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return levels;
        dfs(root,0);
        return levels;
    }

    void dfs(TreeNode root, int level){
        if(root==null) return;
        if(levels.size()==level){
            levels.add(new ArrayList<>());
        }

        levels.get(level).add(root.val);
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
}
```
