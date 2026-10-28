class MyHashMap {
    private int[] storage;
    public MyHashMap() {
        storage = new int[1000001];
        Arrays.fill(storage,-1);
    }
    
    public void put(int key, int value) {
        storage[key] = value;
    }
    
    public int get(int key) {
        return storage[key];
    }
    
    public void remove(int key) {
        storage[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */