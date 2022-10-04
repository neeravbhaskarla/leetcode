class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int base = 0;
        int dupx = x;
        while(dupx!=0){
            base = base*10 + dupx%10;
            dupx/=10;
        }
        return base == x;
    }
}