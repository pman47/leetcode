class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        for(int i=1;i<=9;i++){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            getCombination(list,i,i,k-1,n);
        }
        return ans;
    }
    
    void getCombination(List<Integer> list,int i,int sum,int k,int n){
        if(sum>n) return;
        if(k==0){
            if(sum==n) ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int x=i+1;x<=9;x++){
            list.add(x);
            getCombination(list,x,sum+x,k-1,n);
            list.remove(list.size()-1);
        }
    }
}