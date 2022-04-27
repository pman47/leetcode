class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,n=word1.length(),m=word2.length();
        StringBuilder sb = new StringBuilder();
        while(i<n && j<m){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if(i==n) sb.append(word2.substring(j,m));
        else sb.append(word1.substring(i,n));
        return sb.toString();
    }
}