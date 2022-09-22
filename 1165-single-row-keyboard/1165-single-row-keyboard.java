class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] charset = new int[26];
        for(int i=0; i<keyboard.length(); i++){
            charset[keyboard.charAt(i) - 'a'] = i;
        }
        int result = 0;
        int prev = 0;
        for(char ch: word.toCharArray()){
            result += Math.abs(charset[ch - 'a'] - prev);
            prev = charset[ch - 'a'];
        }
        return result;
    }
}