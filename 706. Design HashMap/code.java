class MyHashMap {
    class Node{
        int key;
        int val;
        Node next;
        Node(int x,int y){
            this.key=x;
            this.val=y;
            this.next = null;
        }
    }
    
    Node root,counter;

    public MyHashMap() {
        root = new Node(-1,-1);
        counter = root;
    }
    
    public void put(int key, int value) {
        Node tmp = root.next;
        while(tmp!=null){
            if(tmp.key == key){
                tmp.val = value;
                return;
            }
            tmp = tmp.next;
        }
        
        counter.next = new Node(key,value);
        counter = counter.next;
    }
    
    public int get(int key) {
        if(root.next == null) return -1;
        Node tmp = root.next;
        while(tmp!=null){
            if(tmp.key == key) return tmp.val;
            tmp = tmp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node tmp = root.next;
        while(tmp!=null){
            if(tmp.key == key){
                tmp.val = -1;
                return;
            }
            tmp=tmp.next;
        }
    }
}