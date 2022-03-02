class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<mat.length; i++) {
            map.put(i, getNumbersOfSoldiers(mat[i]));
        }

        // Sort map by value
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(a) - map.get(b));
        
        return list.stream().limit(k).mapToInt(i -> i).toArray();
    }

    private int getNumbersOfSoldiers(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        // Binary Search to find the first index of 0
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(arr[mid] == 0) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        return start;
    }
}