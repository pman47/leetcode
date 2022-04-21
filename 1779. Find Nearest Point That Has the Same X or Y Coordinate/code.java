class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x){
                int curDist = Math.abs(points[i][1]-y);
                if(curDist<min){
                    min = curDist;
                    index = i;
                }
            }else if(points[i][1]==y){
                int curDist = Math.abs(x-points[i][0]);
                if(curDist<min){
                    min = curDist;
                    index = i;
                }
            }
        }
        return index;
    }
}