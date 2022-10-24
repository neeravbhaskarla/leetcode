class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCharset = new int[26];
        int[] tCharset = new int[26];
        for(char ch: s.toCharArray()){
            sCharset[ch - 'a']++;
        }
        for(char ch: t.toCharArray()){
            tCharset[ch - 'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(sCharset[i] != tCharset[i]) return false;
        }
        return true;
    }
}