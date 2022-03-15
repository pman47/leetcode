class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        // REMOVING DON'T NEEDED CLOSING PARANTHESIS ")"
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(!st.isEmpty())
                {
                    sb.append(s.charAt(i));
                    st.pop();
                }
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                sb.append(s.charAt(i));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        
        s = sb.toString();
        
        // CLEARING EVERYTHING
        sb.setLength(0);
        st.clear();
        
        // REMOVING DON'T NEEDED OPENING PARANTHESIS "("
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                if(!st.isEmpty())
                {
                    sb.append(s.charAt(i));
                    st.pop();
                }
            }
            else if(s.charAt(i)==')'){
                st.push(s.charAt(i));
                sb.append(s.charAt(i));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.reverse().toString();  // RETURNING STRING BY REVERSING
    }
}

// HAPPY CODING :)