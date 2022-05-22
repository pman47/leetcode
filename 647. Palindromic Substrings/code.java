class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+= countPalindrome(s,i,i);
            
            if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))
                count+= countPalindrome(s,i,i+1);
        }
        return count;
    }
    
    static int countPalindrome(String s,int start,int end){
        int counter = 0;
        while(start>=0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            counter++;
            start--;
            end++;
        }
        return counter;
    }
}