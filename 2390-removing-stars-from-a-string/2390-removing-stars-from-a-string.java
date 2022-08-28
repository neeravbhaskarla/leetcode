class Solution {
    public String removeStars(String s) {
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack();
        int i=0;
        while(i<str.length){
            if(str[i] == '*'){
                stack.pop();
            }
            else{
                stack.push(str[i]);
            }
            i++;
        }
        char[] result = new char[stack.size()];
        for(int c = stack.size()-1; c>=0; c--){
            result[c] = stack.pop();
        }
        return new String(result);
    }
}