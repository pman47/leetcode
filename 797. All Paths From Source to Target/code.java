class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int n,m;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        n = graph.length;
        m = graph[0].length;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(0,graph,list);
        return ans;
    }
    
    void dfs(int i,int[][] graph,List<Integer> list){
        if(i==n-1){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int j=0;j<graph[i].length;j++){
            list.add(graph[i][j]);
            dfs(graph[i][j],graph,list);
            list.remove(list.size()-1);
        }
    }
    
}