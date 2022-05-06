class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)) count++;
            else count = 1;
            
            if(count==k){
                sb.delete(i-k+1,i+1);
                if(i-2*k>=0){
                    i=i-2*k;
                }
                else{
                    i=0;
                }
                count = 1;
            }
        }
        return sb.toString();
    }
}