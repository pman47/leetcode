class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length,m = matrix[0].length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(k<=0){
                    if(maxHeap.peek()>matrix[i][j]){
                        maxHeap.poll();
                        maxHeap.add(matrix[i][j]);
                    }
                }else{
                    maxHeap.add(matrix[i][j]);
                    k--;
                }
            }
        }
        
        return maxHeap.peek();
    }
}