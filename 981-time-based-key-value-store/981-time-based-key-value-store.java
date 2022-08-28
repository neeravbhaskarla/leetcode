class TimeMap {
    Map<String, TreeMap<Integer, String>> hash;
    public TimeMap() {
        hash = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hash.get(key) == null) hash.put(key, new TreeMap());
        hash.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeNode = hash.get(key);
        if(treeNode == null) return "";
        Integer floor = treeNode.floorKey(timestamp);
        if(floor == null) return "";
        return treeNode.get(floor);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */