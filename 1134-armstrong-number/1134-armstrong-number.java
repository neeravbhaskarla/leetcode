class Solution {
    public boolean isArmstrong(int n) {
        int digitsCount = 0;
        int num = n;
        while(num!=0){
            num/=10;
            digitsCount++;
        }
        int total = 0;
        num = n;
        while(num!=0){
            total+=Math.pow(num%10, digitsCount);
            num/=10;
        }
        return total == n;
    }
}