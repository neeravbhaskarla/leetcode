class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if(n==0)
            return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        List<Integer> result = new ArrayList<>();
        for(int firstDigit = 1; firstDigit<=9; firstDigit++)
            dfs(n-1, firstDigit, k, result);
        
        return result.stream().mapToInt(i->i).toArray();
    }
    
    public void dfs(int digitCount, int num, int k, List<Integer> result){
        if(digitCount == 0){
            result.add(num);
            return;
        }
        
        int tailDigit = num%10;
        List<Integer> possibleDigits = new ArrayList<>();
        possibleDigits.add(tailDigit+k);
        if(k!=0)
            possibleDigits.add(tailDigit-k);
        for(int digit: possibleDigits){
            if(digit>=0 && digit<=9){
                int number = num*10 + digit;
                dfs(digitCount-1, number, k, result);
            }
        }
    }
}