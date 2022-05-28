class Solution {
    public boolean canFinish(int n, int[][] a) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<a.length;i++){
            adjList.get(a[i][0]).add(a[i][1]);
        }
        
        boolean[] visited = new boolean[n];
        for(int i=0;i<adjList.size();i++){
            if(!visited[i]){
                boolean[] stackVisited = new boolean[n];
                if(isCyclic(i,adjList,visited,stackVisited)) return false;
            }
        }
        
        return true;
    }
    
    boolean isCyclic(int i,ArrayList<ArrayList<Integer>> adjList, boolean[] visited, boolean[] stackVisited){
        visited[i] = true;
        stackVisited[i] = true;
        
        List<Integer> adjVertices = adjList.get(i);
        
        for(int vertex : adjVertices){
            if((!visited[vertex] && isCyclic(vertex, adjList, visited, stackVisited)) || stackVisited[vertex]) return true;
        }
        
        stackVisited[i] = false;
        return false;
    }
}