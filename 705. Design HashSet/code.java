class MyHashSet {
    int[] array;

    public MyHashSet() {
        array=new int[1000001];
    }
    
    public void add(int key) {
        if(array[key]==0) array[key]=1;
    }
    
    public void remove(int key) {
        array[key]=0;
    }
    
    public boolean contains(int key) {
        if(array[key]==1) return true;
        return false;
    }
}