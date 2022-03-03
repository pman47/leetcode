class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0; 
        int end = n - 1;
        int area = 0; 
        int maxArea = 0; 
        while(start < end){
            int shortLine = Math.min(height[start], height[end]);
            area = shortLine*(end-start); 
            if(height[start] > height[end]){
                end--;  
            }else{ 
                start++; 
            }
            maxArea = Math.max(area, maxArea); 
        }
        return maxArea;
    }
}