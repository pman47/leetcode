class Solution {
    public String reorganizeString(String s) {
        char[] count = new char[26];
        for(char ch : s.toCharArray()) count[ch-'a']++;
        
        int idx=0;
        int max = 0;
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max = count[i];
                idx = i;
            }
        }
        
        if(max>(s.length()+1)/2) return new String("");
        
        char[] ans = new char[s.length()];
        
        int t=0;
        while(count[idx]>0){
            ans[t]=(char)(idx+'a');
            t+=2;
            count[idx]--;
        }
        
        for(int i=0;i<26;i++){
            while(count[i]>0){
                if(t>=s.length()){
                    t=1;
                }
                
                ans[t] = (char)(i+'a');
                count[i]--;
                
                t+=2;
            }
        }
        
        return String.valueOf(ans);
    }
}