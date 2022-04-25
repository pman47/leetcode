class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int item = nums1[i];
            boolean flag = false;
            for(int j=0;j<nums2.length;j++){
                if(flag && nums2[j]>item){
                    nums1[i]=nums2[j];
                    break;
                }
                if(nums2[j]==item){
                    flag = true;
                }
            }
            if(item==nums1[i]) nums1[i]=-1;
        }
        return nums1;
    }
}