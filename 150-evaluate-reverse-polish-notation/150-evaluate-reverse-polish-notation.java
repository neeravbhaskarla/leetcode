class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str: tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                if(stack.isEmpty()) continue;
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                if(str.equals("+")) stack.push(operand2+operand1);
                if(str.equals("-")) stack.push(operand2-operand1);
                if(str.equals("*")) stack.push(operand2*operand1);
                if(str.equals("/")) stack.push(operand2/operand1);
            }
            else stack.push(Integer.valueOf(str));
        }
        return stack.pop();
    }
}