class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] ^ arr[i];
        }
        for(int i=0;i<queries.length;i++){
            int[] query = queries[i];
            result[i] = ( query[0] == 0 ? arr[query[1]] : arr[query[0]-1] ^ arr[query[1]]);
        }
        return result;
    }
}