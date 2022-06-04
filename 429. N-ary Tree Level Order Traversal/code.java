
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node node = q.remove();
                list.add(node.val);
                for(Node item : node.children){
                    q.add(item);
                }
            }
            
            ans.add(list);
        }
        return ans;
    }
}