class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left = 0, right = 0;
        int[] charset = new int[58];
        int maxLength = 0;
        while(right<s.length()){
            charset[s.charAt(right) - 'A']++;
            while(!distinct(charset)){
                charset[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
    
    public boolean distinct(int[] charset){
        int count = 0;
        for(int i=0; i<58; i++){
            if(charset[i]>0) count++;
            if(count > 2) return false;
        }
        return true;
    }
}