class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> hash = new HashMap<>();
        for(String st: strs){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(!hash.containsKey(s)) hash.put(s, new ArrayList());
            hash.get(s).add(st);
        }
        return new ArrayList(hash.values());
    }
