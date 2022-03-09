class Solution {    
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> paths = new LinkedList<>();
    int sum = 0;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //In order to get rid of duplicated elements, we need to sort array first.
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return res;      
    }
    
    public void backtrack(int[] candidates, int target, int start){
        if(sum == target){
            res.add(new ArrayList<>(paths));
            return;
        }
        for(int i = start; i < candidates.length && sum + candidates[i] <= target; i++){            
            //Get rid of duplicated element as the array has been sorted, and it is very important
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }          
            sum += candidates[i];
            paths.add(candidates[i]);
            backtrack(candidates, target, i + 1);
            sum -= candidates[i];
            //Get rid of current element as backtracking, and it is very important too
            paths.remove(paths.size() - 1);            
            
        }
    }
    
}