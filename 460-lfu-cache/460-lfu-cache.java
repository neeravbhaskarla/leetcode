class LFUCache {
    final private int capacity;
    private int size;
    private int minFrequency;
    DNode head, tail;
    Map<Integer, DNode> cache;
    Map<Integer, DLinkedList> freq = new HashMap();
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.minFrequency = 0;
        
        cache = new HashMap();
        freq = new HashMap();
    }
    
    public int get(int key) {
        DNode node = cache.get(key);
        if(node == null) return -1;
        update(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;
        if(cache.containsKey(key)){
            DNode node = cache.get(key);
            node.value = value;
            update(node);
        }
        else{
            size++;
            if(size > capacity){
                DLinkedList minFreqList = freq.get(minFrequency);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.remove(minFreqList.tail.prev);
                size--;
            }
            
            minFrequency = 1;
            DNode newNode = new DNode(key, value);
            DLinkedList currList = freq.getOrDefault(1, new DLinkedList());
            currList.add(newNode);
            freq.put(1, currList);
            cache.put(key, newNode);
        }
    }
    
    public void update(DNode node){
        int currFreq = node.frequency;
        DLinkedList currList = freq.get(currFreq);
        currList.remove(node);
        
        if(currFreq == minFrequency && currList.listSize == 0){
            minFrequency++;
        }
        node.frequency++;
        
        DLinkedList newList = freq.getOrDefault(node.frequency, new DLinkedList());
        newList.add(node);
        freq.put(node.frequency, newList);
    }
    
    public class DNode{
        int key;
        int frequency; 
        int value;
        DNode prev;
        DNode next;
        public DNode(int key, int value){
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }
    
    public class DLinkedList{
        public DNode head, tail;
        public int listSize;
        
        public DLinkedList(){
            this.listSize = 0;
            head = new DNode(0, 0);
            tail = new DNode(0, 0);
            
            head.next = tail;
            tail.next = head;
        }
        public void add(DNode node){
            DNode nextNode = head.next;
            node.prev = head;
            node.next = nextNode;
            nextNode.prev = node;
            head.next = node;
            listSize++;
        }
        
        public void remove(DNode node){
            DNode next = node.next;
            DNode prev = node.prev;
            
            prev.next = next;
            next.prev = prev;
            listSize--;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */