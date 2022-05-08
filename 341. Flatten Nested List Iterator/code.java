public class NestedIterator implements Iterator<Integer> {
    static List<Integer> list;
    int count = 0;
    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        flatten(nestedList);
    }

    @Override
    public Integer next() {
        return list.get(count++);
    }

    @Override
    public boolean hasNext() {
        return count<list.size();
    }
    
    void flatten(List<NestedInteger> tmp){
        for(int i=0;i<tmp.size();i++){
            if(tmp.get(i).isInteger()) list.add(tmp.get(i).getInteger());
            else flatten(tmp.get(i).getList());
        }
    }

}