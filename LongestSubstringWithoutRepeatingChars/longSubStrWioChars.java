class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charset = new int[128];
        int left = 0;
        int right = 0;
        int lenOfLongestSubstring = 0;
        while(right<s.length()){
            int r = s.charAt(right);
            charset[r]++;
            while(charset[r]>1){
                charset[s.charAt(left)]--;
                left++;
            }
            lenOfLongestSubstring = Math.max(lenOfLongestSubstring, right-left+1);
            right++;
        }
        return lenOfLongestSubstring;
    }
