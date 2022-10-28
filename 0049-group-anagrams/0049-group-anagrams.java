class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
        for(String st: strs){
            char[] charArray = st.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if(!hash.containsKey(key)) hash.put(key, new ArrayList<String>());
            hash.get(key).add(st);
        }
        return new ArrayList<>(hash.values());
    }
}