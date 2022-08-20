class Solution {
    private int low, maxLen;
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        for(int start = 0; start<s.length()-1; start++){
            extendMiddle(s, start, start);
            extendMiddle(s, start, start+1);
        }
        return s.substring(low, low+maxLen);
    }
    private void extendMiddle(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        int currentLength = right-left-1;
        if(currentLength>maxLen){
            maxLen = currentLength;
            low = left+1;
        }
    }
}