class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] charset = new int[26];
        for(char ch: sentence.toCharArray()){
            charset[ch - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(charset[i] == 0) return false;
        }
        return true;
    }
}