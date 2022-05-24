class Solution {
    public int longestValidParentheses(String s) {
         int max_valid = 0;
         Stack<Integer> stack = new Stack<Integer>();
         stack.push(-1);
        
        for(int i =0 ; i< s.length() ;i++)
        {
            if(s.charAt(i) == '(')
                stack.push(i);
            else
            {
               stack.pop();
               if(stack.empty()) stack.push(i);
               else
                  max_valid = Math.max(max_valid , i-stack.peek());
            }
        }
        return max_valid;
    }
}