class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hash = Map.of(
            'M', 1000,
            'D', 500,
            'C', 100,
            'L', 50,
            'X', 10,
            'V', 5,
            'I', 1
        );
        int right = s.length()-1;
        int max_value = Integer.MIN_VALUE;
        int result =0;
        while(right>=0){
            int val = hash.get(s.charAt(right--));
            if(val<max_value) result-=val;
            else{
                max_value = val;
                result+=val;
            }
        }
        return result;
    }
}