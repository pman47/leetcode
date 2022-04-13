class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int target = nums1[i];
            int low = 0;
            int high = nums2.length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(nums2[mid]==target){
                    set.add(target);
                    break;
                }
                if(nums2[mid]>target) high = mid-1;
                else low=mid+1;
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}