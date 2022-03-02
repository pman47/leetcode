class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int firstIndex = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                firstIndex = mid;
                e=mid-1;
            }else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        
        int lastIndex = -1;
        s=0;
        e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                lastIndex = mid;
                s=mid+1;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        
        if(firstIndex == -1) return ans;
        
        if(firstIndex==lastIndex && firstIndex>-1){
            ans.add(firstIndex);
            return ans;
        }
        
        for(int i=firstIndex; i<=lastIndex;i++) ans.add(i);
        return ans;
    }
}