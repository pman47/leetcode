class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =  list(nums, nums.length);
        list.add(Collections.emptyList());
        return list;
    }
    
    List<List<Integer>> list(int[] arr, int n){
        if(n == 1){
			// base case
			// if array length is 1 then we return the list with one number in it
            List<Integer> list = new LinkedList<>();
            list.add(arr[0]);
            List<List<Integer>> result = new LinkedList<>();
            result.add(list);
            return result;
        }
        int item = arr[n-1];
        List<List<Integer>> remaining = list(arr, n - 1);
        List<List<Integer>> result = new LinkedList<>(remaining);
        result.add(Collections.singletonList(item));
        for(List<Integer> subList: remaining){
            List<Integer> tmp = new LinkedList<>(subList);
            tmp.add(item);
            result.add(tmp);
        }
        return result;
    }
}