class Solution {
    public int reverse(int x) {
        int res = 0;
        int base = 0;
        int sign = (x<0)?-1:1;
        x = Math.abs(x);
        int prevRes = 0;
        while(x>0){
            res = res*10 + x%10;
            if((res - x%10)/10 != prevRes)
                return 0;
            prevRes = res;
            x/=10;
        }
        return res*sign;
    }
}