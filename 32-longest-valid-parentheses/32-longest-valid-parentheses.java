class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0) return 0;
        int left = 0, right = 0;
        int maxCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                left++;
            else
                right++;
            
            if(left == right)
                maxCount = Math.max(maxCount, right*2);
            else if(right>=left)
                left = right = 0;
        }
        left = right = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '(')
                left++;
            else
                right++;
            if(left == right)
                maxCount = Math.max(maxCount, left*2);
            else if(left>=right)
                left = right = 0;
        }
        return maxCount;
    }
}