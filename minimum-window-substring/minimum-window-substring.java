class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int matched = 0;
        int minLen = s.length()+1;
        int startIndex = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        while(right<s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0){
                    matched++;
                }
            }
            while(matched == map.size()){
                int window = right - left + 1;
                if(window<minLen){
                    startIndex = left;
                    minLen = right - left + 1;
                }
                char r = s.charAt(left++);
                if(map.containsKey(r)){
                    if(map.get(r) == 0){
                        matched--;
                    }
                    map.put(r, map.get(r)+1);
                }
            }
            right++;
        }
        return minLen>s.length()?"":s.substring(startIndex, startIndex+minLen);
    }
}