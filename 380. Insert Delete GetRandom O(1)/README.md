### Not in O(1)

<pre>
class RandomizedSet {
    ArrayList<Integer> list;
    int n;

    public RandomizedSet() {
        list = new ArrayList<>();
        n=0;
    }
    
    public boolean insert(int val) {
        for(int i=0;i<n;i++){
            if(list.get(i)==val) return false;
        }
        list.add(val);
        n+=1;
        return true;
    }
    
    public boolean remove(int val) {
        for(int i=0;i<n;i++){
            if(list.get(i)==val){
                list.remove(list.get(i));
                n-=1;
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(new Random().nextInt(n));
    }
}
</pre>
