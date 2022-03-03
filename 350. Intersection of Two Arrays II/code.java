class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums1.length;
        for(int i=0;i<n;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        n=nums2.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}