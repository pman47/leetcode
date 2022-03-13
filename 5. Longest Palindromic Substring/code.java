class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<2) return s;
        
        String maxTempPalindrome=""; 
        String finalOutput="";

        for(int i=0; i< s.length(); i++) {
            String left = getMaxStr(s,i,i); 
            String right = getMaxStr(s,i,i+1);
            maxTempPalindrome = left.length() > right.length() ? left: right;
            finalOutput = finalOutput.length() < maxTempPalindrome.length()? maxTempPalindrome: finalOutput;
        }
        
        return finalOutput;
    }
    
    static String getMaxStr(String s, int left, int right) {
         while(left>=0 && right < s.length() && s.charAt(left)== s.charAt(right)) {
             left--;
             right++;
         }
         return s.substring(left+1,right);
    }
}