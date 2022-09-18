class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
        
        for(String st: strs){
            char[] charA = st.toCharArray();
            Arrays.sort(charA);
            String key = String.valueOf(charA);
            if(!hash.containsKey(key)) hash.put(key, new ArrayList<String>());
            hash.get(key).add(st);
        }
        return new ArrayList<>(hash.values());
    }
}