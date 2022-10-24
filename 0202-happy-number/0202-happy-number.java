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
        Set<Integer> set = new HashSet<>();
        while(set.add(getSum(n))){
            if(getSum(n) == 1) return true;
            n = getSum(n);
        }
        return false;
    }
}