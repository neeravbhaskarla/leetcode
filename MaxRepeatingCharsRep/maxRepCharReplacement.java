class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int mCount = 1;
        int[] charset = new int[26];
        int maxLen = 0;
        while(right<s.length()){
            int r = s.charAt(right) - 'A';
            charset[r]++;
            mCount = Math.max(mCount, charset[r]);
            if(k<(right-left+1)-mCount){
                int l = s.charAt(left)-'A';
                charset[l]--;
                left++;
            }
            maxLen = Math.max(maxLen, (right-left)+1);
            right++;
        }
        return maxLen;
    }
