class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charsetOfs1 = new int[26];
        int[] charsetOfs2 = new int[26];
        for(int i=0; i<s.length(); i++)
            charsetOfs1[s.charAt(i)-'a']++;
        for(int j=0; j<t.length(); j++)
            charsetOfs2[t.charAt(j)-'a']++;
        for(int k=0; k<26; k++){
            if(charsetOfs1[k]!=charsetOfs2[k]){
                return false;
            }
        }
        return true;
    }
