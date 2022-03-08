class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		subsetsWithDup(nums, list, new ArrayList<>(), 0, false);
		return list;
	}
    
	private void subsetsWithDup(int[] nums, List<List<Integer>> ans, List<Integer> list, int j, boolean flag) {
		if (j == nums.length) {
			ans.add(new ArrayList<>(list));
			return;
		}
		subsetsWithDup(nums, ans, list, j + 1, false);
		if (j > 0 && nums[j] == nums[j - 1] && !flag) {
			return;
		}
		list.add(nums[j]);
		subsetsWithDup(nums, ans, list, j + 1, true);
		list.remove(list.size() - 1);
	}
}