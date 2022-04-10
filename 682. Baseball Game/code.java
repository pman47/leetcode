class Solution {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        int total = 0;
        int score = 0;
        
        for (String op : ops) {
            switch(op) {
                case "+":
                    int top = stack.pop();
                    score = top + stack.peek();
                    total += score;
                    stack.push(top);
                    stack.push(score);
                    break;
                case "D":
                    score = 2*stack.peek();
                    total += score;
                    stack.push(score);
                    break;
                case "C":
                    total -= stack.pop();
                    break;
                default:
                    score = Integer.parseInt(op);
                    total += score;
                    stack.push(score);
                    break;
            }
        }
        
        return total;
    }
}