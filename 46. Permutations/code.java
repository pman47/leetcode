class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(new ArrayList<>(),list,nums);
        return list;
    }
    
    private void helper(List<Integer> op,List<List<Integer>> list,int[] nums) {
        //if no of element in output list reaches nums length print
        if(op.size()==nums.length) {
            list.add(new ArrayList<>(op));
            return;
        }
        
        //for every element add it to the op list.
        for(int j=0;j<nums.length;j++) {
            //if set already contains it don't add it.
            if(op.contains(nums[j])) continue;
            //consider nums[i] element
            op.add(nums[j]);
            //call with updated data
            helper(op,list,nums);
            //backtrack
            op.remove(op.size()-1);
        }
    }
}