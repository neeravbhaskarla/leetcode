class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int left = 2;
        int right = x/2;
        long num;
        while(left<=right){
            int pivot = left + (right-left)/2;
            num = (long) pivot*pivot;
            if(num == x) return pivot;
            else if(num>x){
                right = pivot-1;
            }
            else{
                left = pivot+1;
            }
        }
        return right;
    }
}