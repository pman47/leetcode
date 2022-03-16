class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length)
            return false;
        Stack<Integer> stack = new Stack<Integer>();
        int j=0;
        for(int i=0; i<pushed.length; i++){
            stack.push(pushed[i]);
           while(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }
}