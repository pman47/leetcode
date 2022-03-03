class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int size1 = firstList.length - 1;
        int size2 = secondList.length - 1;
        int l = 0, r = 0;
        
        List<int[]> list = new ArrayList<>();
        while(l <= size1 && r <= size2){
            int[] temp1 = firstList[l];
            int[] temp2 = secondList[r];
            if(temp1[1] < temp2[0])
                l++;
            else if(temp1[0] > temp2[1])
                r++;
            else{
                list.add(new int[]{Math.max(temp1[0], temp2[0]), Math.min(temp1[1], temp2[1])});
                if(temp1[1] > temp2[1])
                    r++;
                else if(temp1[1] < temp2[1])
                    l++;
                else{
                    l++;
                    r++;
                }
            }
        }
        int[][] res = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}