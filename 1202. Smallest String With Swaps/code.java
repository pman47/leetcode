class Solution {
    ArrayList<Integer>[] graph;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        graph = new ArrayList[n];
        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i<pairs.size(); i++){
            int u = pairs.get(i).get(0);
            int v = pairs.get(i).get(1);
            graph[u].add(v);
            graph[v].add(u);
        }
        
        boolean[] isVisited = new boolean[n];
        char[] res = new char[n];
        for(int i = 0; i<n; i++){
            if(!isVisited[i]){
                ArrayList<Integer> indicies = new ArrayList<>();
                DFT(i, isVisited, indicies);
                GenerateString(indicies, s, res);
            }
        }
        return new String(res);
    }
    
    void DFT(int node, boolean[] isVisited, ArrayList<Integer> indicies){
        if(isVisited[node])return;
        
        indicies.add(node);
        isVisited[node] = true;
        
        for(Integer neighbour : graph[node]){
            DFT(neighbour, isVisited, indicies);
        }
    }
    
    void GenerateString(ArrayList<Integer> indicies, String s, char[] res){
        ArrayList<Character> characters = new ArrayList<>();
        
        for(Integer index : indicies){
            characters.add(s.charAt(index));
        }
        
        Collections.sort(indicies);
        Collections.sort(characters);
        
        for(int i = 0; i<indicies.size(); i++){
            int index = indicies.get(i);
            char character = characters.get(i);
            
            res[index] = character;
        }
    }
}