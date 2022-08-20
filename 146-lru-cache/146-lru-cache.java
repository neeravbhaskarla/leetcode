class LRUCache {
    private Map<Integer, DNode> cache = new HashMap<>();
    private int capacity, size;
    
    private class DNode{
        DNode prev;
        DNode next;
        
        int key;
        int value;
    }
    
    DNode head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        
        head = new DNode();
        tail = new DNode();
        
        head.next = tail; 
        tail.prev = head;
    }
    
    public void appendHead(DNode node){
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }

    public void removeNode(DNode node){
        DNode prev = node.prev;
        DNode next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }

    public DNode removeTail(){
        DNode trailPrev = tail.prev;
        removeNode(trailPrev);
        return trailPrev;
    }

    public int get(int key) {
        DNode node = cache.get(key);
        if(node == null) return -1;
        removeNode(node);
        appendHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DNode node = cache.get(key);
        if(node == null){
            node = new DNode();
            node.key = key;
            node.value = value;
            cache.put(key, node);
            appendHead(node);
            ++size;
            if(size > capacity){
                DNode tail = removeTail();
                cache.remove(tail.key);
                --size;
            }   
        }
        else{
            node.value = value;
            removeNode(node);
            appendHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */