class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length; 
        int n2= nums2.length;
        
        int nums[]= new int[n1+n2];
        
        int i=0, j=0, k=0;
        
        while(i<n1 && j<n2){
            if(nums1[i] < nums2[j])
                nums[k++]=nums1[i++];
            else
                nums[k++]=nums2[j++];
        }
        
        while(i<n1)
            nums[k++]=nums1[i++];
        
        while(j<n2)
            nums[k++]=nums2[j++];
        
        double median=0;
        if(nums.length % 2 == 0)
        median = (double) (nums[nums.length / 2] + nums[(nums.length / 2) - 1])/2;   
        else 
        median = (double) nums[nums.length / 2];
     
        return median;    
    }
}