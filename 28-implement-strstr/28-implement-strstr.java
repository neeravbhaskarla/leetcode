class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        if (needle.length() == 0)
            return 0;
        
        if (haystack.length() < needle.length()) 
            return -1;
        
        for (i = 0; i < haystack.length() - needle.length() + 1; ++i) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}