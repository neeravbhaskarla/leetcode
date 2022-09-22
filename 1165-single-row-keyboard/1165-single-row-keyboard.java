class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<keyboard.length(); i++){
            map.put(keyboard.charAt(i), i);
        }
        int result = 0;
        int prev = 0;
        for(char ch: word.toCharArray()){
            result += Math.abs((map.get(ch)) - prev);
            prev = map.get(ch);
        }
        return result;
    }
}