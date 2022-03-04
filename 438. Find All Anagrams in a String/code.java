class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // sliding window
        // add into the window: increase its frequency by one
        // delete from the window, subtract its frequency by one
        
        int size = p.length();
        int[] arrP = new int[26];
        int[] arrS = new int[26];
        List<Integer> res = new ArrayList<>();
        
        
        for(int i = 0; i < p.length(); i++){
            arrP[p.charAt(i) - 'a'] += 1;
        }
        
        
        int curSize = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            arrS[c - 'a'] += 1;
            curSize++;
            if(curSize > size){
                arrS[s.charAt(i - size) - 'a'] -= 1;
            }
            
            if(Arrays.equals(arrS, arrP))
                res.add(i - size + 1);
        }
        return res;
    }
}