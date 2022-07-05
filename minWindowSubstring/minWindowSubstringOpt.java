class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> hash = new HashMap();
        for(char ch: t.toCharArray()) hash.put(ch, hash.getOrDefault(ch, 0)+1);
        int left=0;
        int minLen = s.length()+1;
        int startSub = 0;
        int matched = 0;
        for(int right = 0; right<s.length(); right++){
            char r = s.charAt(right);
            if(hash.containsKey(r)){
                hash.put(r, hash.get(r)-1);
                if(hash.get(r) == 0) matched++;
            }
            while(matched == hash.size()){
                int window = right-left+1;
                if(window<minLen){
                    startSub = left;
                    minLen = window;
                }
                char l = s.charAt(left++);
                if(hash.containsKey(l)){
                    if(hash.get(l) == 0) matched--;
                    hash.put(l, hash.get(l)+1);
                }
            }
        }
        return minLen>s.length()?"":s.substring(startSub, startSub+minLen);
    }
