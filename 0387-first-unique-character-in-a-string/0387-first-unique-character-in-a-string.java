class Solution {
    public int firstUniqChar(String s) {
        int[] charset = new int[26];
        for(char ch: s.toCharArray()){
            charset[ch - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(charset[s.charAt(i) - 'a']==1) return i;
        }
        return -1;
    }
}