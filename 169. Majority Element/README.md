<pre>
class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i : nums ) map.put(i,map.getOrDefault(i,0)+1);
        // int freq = 0, ans=0;
        // for(int keys : map.keySet()){
        //     if(map.get(keys)>freq){
        //         freq = map.get(keys);
        //         ans = keys;
        //     }
        // }
        // return ans;
        
        int candidate = 0;
        int votes = 0;
        for(int i : nums){
            if(votes==0) candidate = i;
            if(candidate==i) votes++;
            else votes--;
        }
        return candidate;
    }
}
</pre>
