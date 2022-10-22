class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('}', '{',
                                               ')', '(',
                                               ']', '[');
        Stack<Character> stack = new Stack();
        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                if(stack.empty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}