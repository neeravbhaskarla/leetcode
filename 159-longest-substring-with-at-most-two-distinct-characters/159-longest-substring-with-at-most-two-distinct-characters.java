class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        if(n < 3) return n;
        int left = 0, right = 0;
        Map<Character, Integer> hashmap = new HashMap<>();
        int maxLength = 2;
        while(right<n){
            hashmap.put(s.charAt(right), right++);
            if(hashmap.size() == 3){
                int del_idx = Collections.min(hashmap.values());
                hashmap.remove(s.charAt(del_idx));
                left = del_idx + 1;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}