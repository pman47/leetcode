class Solution {
    int h1=0;
    int h2=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
  
        TreeNode firstParent = isCousinsHelper(root, x, null,0, true);
        TreeNode secondParent = isCousinsHelper(root, y, null,0, false);
        if(h1==h2)
       {     
        if(firstParent==secondParent ) return false;
        else return true;
        }
        return false;
    }
    TreeNode isCousinsHelper(TreeNode curr, int v, TreeNode parent, int height, boolean isFirst)
    {
        if(curr==null) return null;
        if(curr.val==v) {
            if(isFirst== true) h1 = height + 1;
            else h2 = height + 1;
            return parent;
        }
        TreeNode left =  isCousinsHelper(curr.left, v , curr, height+1, isFirst);
        TreeNode right = isCousinsHelper(curr.right, v , curr, height+1,isFirst);
  
        if(left!=null) return left;
        else if(right!=null) return right;
        return null;
    }
    
}