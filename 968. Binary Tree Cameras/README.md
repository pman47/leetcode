<pre>
class Solution {
    
      static int count;
    //-1 -> needed camera
    //0  -> not a camera but covered
    //1  -> itself is camera

     public static int helper(TreeNode root) {
       if(root==null) return 0;
       
       int lv = helper(root.left);
       int rv = helper(root.right);
       
       if(lv==-1 || rv==-1){
           count++;
           return 1;
       }else if(lv==1 || rv==1){
           return 0;
       }else{
           return-1;
       }
       
    }
    
    public int minCameraCover(TreeNode root) {
        count=0;
        int v = helper(root);
        if(v==-1) count++;
        return count;
    }
}
</pre>
