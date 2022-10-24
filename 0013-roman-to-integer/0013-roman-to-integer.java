class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1,
                                             'V', 5,
                                             'X', 10,
                                             'L', 50,
                                             'C', 100,
                                             'D', 500,
                                             'M', 1000);
        int iter = s.length()-1;
        int sum = 0;
        int prevLarge = Integer.MIN_VALUE;
        while(iter>=0){
            int val = map.get(s.charAt(iter));
            if(val<prevLarge){
                sum-=val;
            }
            else{
                sum+=val;
                prevLarge = val;
            }
            iter--;
        }
        return sum;
    }
}