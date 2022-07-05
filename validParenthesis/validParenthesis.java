class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> par = new HashMap();
        par.put('}', '{');
        par.put(']', '[');
        par.put(')', '(');
        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(par.containsKey(ch)){
                if(stack.empty() || stack.pop() != par.get(ch))
                    return false;   
            }
            else
                stack.push(ch);
        }
        return stack.empty();
    }
