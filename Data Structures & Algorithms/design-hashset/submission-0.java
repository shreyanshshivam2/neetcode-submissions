class MyHashSet {


    private static final int SIZE =  1009;
    private LinkedList<Integer> [] buckets;

    public MyHashSet() {
        buckets =  new LinkedList[SIZE];
    }
    

    private int hash(int key){
        return key%SIZE;
    }

    public void add(int key) {
        int index =  hash(key);

        if(buckets[index] == null){
            buckets[index] =  new LinkedList<>();
        }

        for(int val : buckets[index]){
            if(val == key)
            return;
        }

        buckets[index].add(key);
        
    }


    
    public void remove(int key) {
        int index =  hash(key);

        if(buckets[index] == null){
           return;
        }

        buckets[index].remove(Integer.valueOf(key));
    }

    
    public boolean contains(int key) {
        int index =  hash(key);

        if(buckets[index] == null){
           return false;
        }
        
        for(int val : buckets[index]){
            if(val == key)
            return true;
        }

        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */