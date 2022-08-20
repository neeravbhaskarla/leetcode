class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap();
        for(String str: strs){
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String key = String.valueOf(strArray);
            if(!hash.containsKey(key)) hash.put(key, new ArrayList<String>());
            hash.get(key).add(str);
        }
        return new ArrayList(hash.values());
    }
}