class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0;
        char prev = '_';
        int score = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                depth++;
            } else {
                depth--;
                if(prev == '(') {
                    score += Math.pow(2, depth);
                }
            }
            prev = c;
        }
        return score;
    }
}