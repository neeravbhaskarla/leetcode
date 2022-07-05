class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int mCount = 1;
        int[] freq = new int[26];
        int maxLen = 0;
        while(right<s.length()){
            char chR = s.charAt(right);
            freq[chR - 'A']++;
            mCount = Math.max(mCount, freq[chR - 'A']);
            if(k+mCount<(right-left+1)){
                char chL = s.charAt(left);
                freq[chL-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
