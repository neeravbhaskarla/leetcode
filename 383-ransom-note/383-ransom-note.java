class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] ransomNoteCharset = new int[26];
        int[] magazineCharset= new int[26];
        Arrays.fill(ransomNoteCharset, 0);
        Arrays.fill(magazineCharset, 0);
        for(char ch: ransomNote.toCharArray()){
            ransomNoteCharset[ch - 'a']++;
        }
        for(char ch: magazine.toCharArray()){
            magazineCharset[ch - 'a']++;
        }
        for(int ch: ransomNote.toCharArray()){
            if(magazineCharset[ch-'a'] < ransomNoteCharset[ch-'a']) return false;
        }
        return true;
    }
}