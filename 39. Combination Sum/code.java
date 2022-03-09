class Solution {
    List<List<Integer>> ans;
    private void findSum(int i, int target, List<Integer> consider, int[] candidates){
        if(target == 0){
            ans.add(new ArrayList<>(consider));
            return;
        }
        else if(i == candidates.length)
            return;
        else if(target < 0)
            return;
        else{
			//Case When we dont cosider the value to be inserted.
            findSum(i+1, target, consider, candidates);
            
			//Case when we consider the value to be inserted.
            consider.add(candidates[i]);
            findSum(i, target-candidates[i], consider, candidates);
            consider.remove(consider.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        findSum(0, target, new ArrayList<>(), candidates);
        
        return ans;
    }
}