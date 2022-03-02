class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(index[i],nums[i]);
        }
        int[] tar = new int[nums.length];
        for(int i=0;i<tar.length;i++){
            tar[i]=al.get(i);
        }
        return tar;
    }
}