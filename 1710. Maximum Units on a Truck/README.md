<pre>
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((int a[],int b[])->{
            return b[1]-a[1];
        });
        
        for(int[] i : boxTypes){
            pq.add(i);
        }
        
        int ans = 0;
        while(!pq.isEmpty() && truckSize>0){
            int[] a = pq.remove();
            if(truckSize-a[0]>=0){
                ans+=a[0]*a[1];
                truckSize-=a[0];
            }else{
                while(a[0]>0 && truckSize>0){
                    a[0]-=1;
                    ans+=a[1];
                    truckSize-=1;
                }
            }
        }
        return ans;
    }
}
</pre>
