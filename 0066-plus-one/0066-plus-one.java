class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        int index = digits.length - 1;
        int carry = 0;
        digits[index]++;
        while(!flag && index>=0){
            int val = digits[index]+carry;
            if(val>9){
                carry = (int)val/10;
                val = val%10;
                digits[index--] = val;
            }
            else{
                digits[index] = val;
                flag = true;
            }
        }
        if(carry != 0 && index==-1){
            int[] copydigits = new int[digits.length+1];
            index = digits.length-1;
            int iter = digits.length;
            while(iter>=0 && index>=0){
                copydigits[iter--] = digits[index--];
            }
            copydigits[0] = carry;
            digits = copydigits;
        }
        return digits;
    }
}