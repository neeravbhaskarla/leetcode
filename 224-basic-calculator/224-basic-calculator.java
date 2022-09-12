class Solution {
    public int evaluate(Stack<Object> stack){
        if(stack.empty() || !(stack.peek() instanceof Integer)){
            stack.push(0);
        }
        
        int res = (int) stack.pop();
        
        while(!stack.empty() && !((char) stack.peek() == ')')){
            char sign = (char) stack.pop();
            
            if(sign == '+'){
                res+=(int) stack.pop();
            }
            else{
                res-=(int) stack.pop();
            }
        }
        return res;
    }
    public int calculate(String s) {
        Stack<Object> stack = new Stack<>();
        int n = 0;
        int operand = 0;
        for(int it = s.length()-1; it>=0; it--){
            char ch = s.charAt(it);
            if(Character.isDigit(s.charAt(it))){
                operand = (int) Math.pow(10, n) * (int) (ch - '0') + operand;
                n++;
            }
            else if(ch!=' '){
                if(n!=0){
                    stack.push(operand);
                    n = 0;
                    operand = 0;
                }
                if(ch=='('){
                    int res = evaluate(stack);
                    stack.pop();
                    
                    stack.push(res);
                }
                else{
                    stack.push(s.charAt(it));
                }
            }
        }
        
        if(n!=0){
            stack.push(operand);
        }
        
        return evaluate(stack);
    }
}