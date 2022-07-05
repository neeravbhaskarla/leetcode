class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> hash = new HashMap<>();
        int left = 0, right = 0, maxLen = 0;
        while(right<s.length()){
            int window = right-left+1;
            hash.put(s.charAt(right), hash.getOrDefault(s.charAt(right), 0)+1);
            int maxVal = Collections.max(hash.values());
            if(window-maxVal<=k){
                maxLen = Math.max(maxLen, window);
            }
            else{
                if(hash.get(s.charAt(left))>0){
                    hash.put(s.charAt(left), hash.get(s.charAt(left))-1);
                }
                else{
                    hash.remove(s.charAt(left));
                }
                left++;
            }
            right++;
        }
        return maxLen;
    }
