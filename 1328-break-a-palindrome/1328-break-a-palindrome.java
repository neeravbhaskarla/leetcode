class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) return "";
        
        char[] p = palindrome.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (p[i] != 'a') {
                p[i] = 'a';
                return new String(p);
            }
        }
        p[n - 1] = 'b';
        return new String(p);
    }
}