class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1,
                                             'V', 5,
                                             'X', 10,
                                             'L', 50,
                                             'C', 100,
                                             'D', 500,
                                             'M', 1000,
                                             'Z', 0);
        char charMax = 'Z';
        int right = s.length()-1;
        int ans = 0;
        while(right>=0){
            char ch = s.charAt(right);
            if(map.get(ch)<map.get(charMax)){
                ans-=map.get(ch);
            }
            else{
                ans+=map.get(ch);
                charMax = ch;
            }
            right--;
        }
        return ans;
    }
}