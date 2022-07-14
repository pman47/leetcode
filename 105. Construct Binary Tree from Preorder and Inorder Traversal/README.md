```
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return createTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }

    TreeNode createTree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,HashMap<Integer,Integer> map){
        if(preStart>preEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = map.get(root.val);
        int left = inRoot-inStart;

        root.left = createTree(preorder,preStart+1,preStart+left,inorder,inStart,inRoot-1,map);
        root.right = createTree(preorder,preStart+left+1,preEnd,inorder,inRoot+1,inEnd,map);

        return root;
    }
}
```
