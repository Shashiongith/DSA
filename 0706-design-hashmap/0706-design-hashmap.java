class MyHashMap {
    private static class Node {
        int key, val;
        Node next;
        Node(int key, int val) { this.key = key; this.val = val; }
    }

    private final Node[] buckets = new Node[10007];

    private int hash(int key) {
        return key % buckets.length;
    }

    public void put(int key, int value) {
        int i = hash(key);
        Node cur = buckets[i];
        while (cur != null) {
            if (cur.key == key) {       // key exists: update
                cur.val = value;
                return;
            }
            cur = cur.next;
        }
        Node node = new Node(key, value); // key not found: insert at head
        node.next = buckets[i];
        buckets[i] = node;
    }

    public int get(int key) {
        Node cur = buckets[hash(key)];
        while (cur != null) {
            if (cur.key == key) return cur.val;
            cur = cur.next;
        }
        return -1;
    }

    public void remove(int key) {
        int i = hash(key);
        Node cur = buckets[i], prev = null;
        while (cur != null) {
            if (cur.key == key) {
                if (prev == null) buckets[i] = cur.next; // removing head
                else prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */