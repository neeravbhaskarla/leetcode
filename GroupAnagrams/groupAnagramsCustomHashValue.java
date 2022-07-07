class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> hash = new HashMap<>();
        for(String st: strs){
            String keyString = getHashKey(st);
            if(!hash.containsKey(keyString)) hash.put(keyString, new ArrayList<>());
            hash.get(keyString).add(st);
        }
        return new ArrayList(hash.values());
    }
    public static String getHashKey(String unHashedKey){
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(int i=0; i<unHashedKey.length(); i++){
            count[unHashedKey.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            sb.append(count[i]);
            sb.append("#");
        }
        return sb.toString();
    }
