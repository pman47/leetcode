class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                int val = s.charAt(i)-'0';
                val*=10;
                val+=s.charAt(i+1)-'0';
                ans.append((char)(val-1+'a'));
                i+=2;
            }else{
                ans.append((char)(s.charAt(i)-'0'+'a'-1));
            }
        }
        return ans.toString();
    }
}