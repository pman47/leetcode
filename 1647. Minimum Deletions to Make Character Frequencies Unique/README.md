<pre>
class Solution {
    public int minDeletions(String s) {
        int count=0;
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        Set<Integer> set=new HashSet<>();
        for(char c:map.keySet()){
            int freq=map.get(c);
            
            if(!set.contains(freq)) set.add(freq);
            
            else{
                while(freq>0 && set.contains(freq)){
                    count++;
                    freq--;
                }
                if(freq>0) set.add(freq);
            }
        }
       return count;
    }
}
</pre>
