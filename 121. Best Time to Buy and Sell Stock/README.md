<pre>
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0,min_value = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min_value = Math.min(min_value,prices[i]);
            ans = Math.max(ans,prices[i]-min_value);
        }
        return ans;
    }
}
</pre>
