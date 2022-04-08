class Solution {
    public int arrangeCoins(int n) {
        long lo=0;
        long hi=n;
        
        while(lo<=hi) {
            long mid=lo+(hi-lo)/2;
            long coins=mid*(mid+1)/2;
            
            if(coins==n) return (int)mid;
            else if(coins<n) lo=mid+1;
            else hi=mid-1;
        }
        return (int)hi;
        
    }
}