// METHOD 1
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;
        if(head == null) return true;
        return dfs(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }
    
    boolean dfs(ListNode head,TreeNode root){
        if(head==null) return true;
        if(root==null) return false;
        return (head.val == root.val) && (dfs(head.next,root.left) || dfs(head.next,root.right));
    }
    
}

// METHOD 2
class Solution {
    boolean flag = false;
    public boolean isSubPath(ListNode head, TreeNode root) {
        getSameHeadNode(head,root);
        return flag;
    }
    
    void getSameHeadNode(ListNode head,TreeNode root){
        if(root==null) return;
        if(head.val == root.val){
            checkIfSame(head,root);
        }
        if(flag) return;
        getSameHeadNode(head,root.left);
        getSameHeadNode(head,root.right);
    }
    
    void checkIfSame(ListNode head,TreeNode root){
        if(head==null){
            flag = true;
            return;
        }
        
        if(root==null || head.val != root.val) return;
        
        checkIfSame(head.next,root.left);
        checkIfSame(head.next,root.right);
    }
    
}