class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<k;i++) minHeap.add(nums[i]);
        
        for(int i=k;i<nums.length;i++){
            if(minHeap.peek()>nums[i]){
                continue;
            }else{
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        System.out.println(minHeap);
        return minHeap.peek();
    }
}