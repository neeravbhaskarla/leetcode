class Solution {
    public String getHashCode(String str){
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String st: strs){
            String key = getHashCode(st);
            if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
            map.get(key).add(st);
        }
        return new ArrayList(map.values());
    }
}