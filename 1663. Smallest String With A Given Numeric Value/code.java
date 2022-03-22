class Solution {
    public String getSmallestString(int n, int k) {
        char c[] = new char[n];
		// Frist fill up the array with least possible alphabet 'a'
        for(int i=0;i<n;i++){
            c[i]='a';
            k--;
        }        
		// Now Start filling from the end to make string according to dictionary method
        while(k!=0){
            if(k>=25){
                c[n-1]='z';
                k-=25;
                n--;
            }else{
                c[n-1] = (char)(97+k);
                k=0;
                n--;
            }
        }
        return String.valueOf(c);
    }
}