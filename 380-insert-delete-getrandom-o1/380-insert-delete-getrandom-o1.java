class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> dict;
    Random rand = new Random();
    public RandomizedSet() {
        list = new ArrayList<>();
        dict = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(dict.containsKey(val)) 
            return false;
        dict.put(val, list.size());
        list.add(list.size(), val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!dict.containsKey(val)) 
            return false;
        int index = dict.get(val);
        dict.remove(val);
            
        int lastIndex = list.size()-1;
        int lastElement = list.get(lastIndex);
        
        if(lastIndex!=index){
            list.set(index, lastElement);
            dict.put(lastElement, index);   
        }
        list.remove(lastIndex);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */