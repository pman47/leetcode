<pre>
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] == b[0])
                    return a[1] - b[1];
                else 
                    return  b[0] - a[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        
        for(int[] curr : people){
            
            if(curr[1] >= ans.size())
            {
                ans.add(curr);
            }
            else{
                ans.add(curr[1], curr);
            }
        }
        return ans.toArray(new int[people.length][]);
    }
}
</pre>
