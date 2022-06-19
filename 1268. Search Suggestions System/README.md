<pre>
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        for(int i=1;i<=searchWord.length();i++){
            String tmp = searchWord.substring(0,i);
            List<String> list = new ArrayList<String>();
            for(String p : products){
                if(p.startsWith(tmp)){
                    list.add(p);
                    Collections.sort(list);
                    if(list.size()==4){
                        list.remove(list.size()-1);
                    }
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
</pre>
