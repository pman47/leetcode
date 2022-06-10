
class Node{
    int id;
    int time;
    ArrayList<Node> children;
    Node(int id,int time){
        this.id = id;
        this.time = time;
        children = new ArrayList<>();
    }
}

class Solution {
    int ans = 0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Node[] arr = new Node[n];
        for(int i=0;i<n;i++){
            arr[i] = new Node(i,informTime[i]);
        }
        for(int i=0;i<n;i++){
            if(manager[i]!=-1){
                arr[manager[i]].children.add(arr[i]);
            }
        }
        solve(arr[headID],0);
        return ans;
    }
    
    void solve(Node root,int time){
        if(root.children.size()==0){
            ans = Math.max(ans,time);
        }
        for(Node i : root.children){
            solve(i,time+root.time);
        }
    }
    
}