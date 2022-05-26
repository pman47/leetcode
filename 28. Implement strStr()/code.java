class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(),m=needle.length();
        for(int i=0;i<n-m+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(isSame(haystack,needle,i,0)) return i;
            }
        }
        return -1;
    }
    
    boolean isSame(String a,String b,int i,int j){
        if(j>=b.length()) return true;
        if(a.charAt(i)!=b.charAt(j)) return false;
        return isSame(a,b,i+1,j+1);
    }
    
}