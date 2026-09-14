class MyHashMap {
    
    private static final int SIZE = 1009;
    private LinkedList<Node> [] buckets;
 
    public MyHashMap() {
        buckets =  new LinkedList[SIZE];
    }

    private int hash(int key){
        return key%SIZE;
    }
    
    public void put(int key, int value) {
        int index =  hash(key);

        if (buckets[index]==null){
            Node temp = new Node(key,value);
            buckets[index] =  new LinkedList<>();
            buckets[index].add(temp);
        } else {
        for (Node n : buckets[index]){
        if (n.key == key){
            n.value =  value;
            return;
        }
        
    }
    Node temp = new Node(key,value);
    buckets[index].add(temp);
        }

    }
    
    public int get(int key) {
        int index =  hash(key);
    if (buckets[index]==null){
        return -1;
    }

    for (Node n : buckets[index]){
        if (n.key == key)
        return n.value;
    }

    return -1;
    }
    
    public void remove(int key) {
      int index =  hash(key);
        if (buckets[index]==null){
            return;
    }
    
    Iterator <Node> it = buckets[index].iterator();
    while (it.hasNext()){
        Node n =  it.next();
        if (n.key == key){
        // buckets[index].remove(n);
        it.remove();
        return;
        }
    }

    /* WHY NOT USE FOR EACH 
    for (Node n : buckets[index]){
        if (n.key == key)
        buckets[index].remove(n);
    }
    */
        
    }
}

class Node {
    int key;
    int value;
    public Node(int key, int value) {
    this.key = key;
    this.value =  value;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
