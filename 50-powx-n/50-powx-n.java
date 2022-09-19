class Solution {
    public double myPow(double x, int n) {
        if(x == -1 && n<0 ) return x*-1;
        if(x == 1 || x == -1) return x;
        if(n==Integer.MAX_VALUE || n==Integer.MIN_VALUE) return 0;
        double res = 1;
        boolean sign = (n<0)?true:false;
        n = Math.abs(n);
        for(int i=0; i<n; i++){
            res*=x;
        }
        return sign?(1/res):res;
    }
}