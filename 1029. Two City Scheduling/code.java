class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0] - a[1], b[0] - b[1]);
            }
        });

        int cost = 0;
        for(int i = 0; i < costs.length / 2; i++)
            cost += costs[i][0];

        for(int i = costs.length / 2; i < costs.length; i++)
            cost += costs[i][1];

        return cost;
    }
}