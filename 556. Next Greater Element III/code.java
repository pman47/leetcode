class Solution {
    public int nextGreaterElement(int n) {
        char[] num = Integer.toString(n).toCharArray();
        int i;
        for(i=num.length-2;i>=0;i--){
            if(num[i]<num[i+1]) break;
        }
        if(i<0) return -1;
        
        int smallest=Integer.MAX_VALUE,smallestIndex=i+1;
        for(int j=i+1;j<num.length;j++){
            if(num[j] > num[i] && num[j] < smallest){
                smallest=num[j];
                smallestIndex = j;
            }
        }
        
        char tmp = num[i];
        num[i] = num[smallestIndex];
        num[smallestIndex] = tmp;
        
        Arrays.sort(num,i+1,num.length);
        
        long val = Long.parseLong(new String(num));
        return val > Integer.MAX_VALUE ? -1 : (int)val ;
        
    }
}