class Solution {
    public int myAtoi(String s) {
        if(s.length() < 1) return 0;
        int base = 0, i = 0, sign = 1;
        while(i<s.length() && s.charAt(i) == ' ') i++;
        if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = (s.charAt(i++) == '-')? -1: 1;
        }
        while(i<s.length() && s.charAt(i) >='0' && s.charAt(i)<='9'){
            if(base > Integer.MAX_VALUE/10 || (base == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)){
                if(sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            base = 10*base + (s.charAt(i++) - '0');
        }
        return base*sign;
    }
}