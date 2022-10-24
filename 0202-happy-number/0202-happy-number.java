class Solution {
    public int getSum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            n/=10;
            sum+=(digit*digit);
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getSum(n);
        while(fast!=1 && slow != fast){
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }
        return fast == 1;
    }
}