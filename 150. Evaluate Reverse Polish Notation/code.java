class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = stack.pop();
                stack.push(stack.pop()+a);
            }else if(tokens[i].equals("-")){
                int a = stack.pop();
                stack.push(stack.pop()-a);
            }else if(tokens[i].equals("*")){
                int a = stack.pop();
                stack.push(stack.pop()*a);
            }else if(tokens[i].equals("/")){
                int a = stack.pop();
                stack.push(stack.pop()/a);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}