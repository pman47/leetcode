class Solution {
    public class Pair implements Comparable<Pair>{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
        
        public int compareTo(Pair o){
           return  this.freq-o.freq;
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        
        int arr[]=new int[k];
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int v:hm.keySet()){
            pq.add(new Pair(v,hm.get(v)));
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        int i=0;
        while(pq.size()>0){
            Pair peek=pq.remove();
            arr[i++]=peek.val;
        }
        
        return arr;
    }
}