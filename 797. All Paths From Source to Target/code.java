class Solution {
    List<List<Integer>> paths;
    
    private void findPath(int source, int destination, List<Integer> currentPath, int[][] graph){
        if(source == destination){
            paths.add(new ArrayList<>(currentPath));
            return;
        }
        for(int i = 0; i < graph[source].length; i++){
            currentPath.add(graph[source][i]);
            findPath(graph[source][i], destination, currentPath, graph);
            currentPath.remove(currentPath.size()-1);
        }
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        paths = new ArrayList<>();
        int n = graph.length;
        ArrayList<Integer> currentPath = new ArrayList<>();
        currentPath.add(0);
        findPath(0, n-1, currentPath, graph);
        return paths;
    }
}