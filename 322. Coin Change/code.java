class Solution {
    public int coinChange(int[] coins, int amount) {
        int d[] = new int[amount + 1]; //represent minimum amount of coun for each aarray element 
        Arrays.fill(d, amount + 1);  
        d[0] = 0; 
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i)
                    d[i] = Math.min(d[i],1 + d[i - coins[j]]);
            }
        }
        return d[amount] > amount ? -1 : d[amount];
    }
}