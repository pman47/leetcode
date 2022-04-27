class Solution {
    public String interpret(String command) {
        StringBuffer result = new StringBuffer();
        boolean isOpen = false, isCharFound = false;
        for(int i = 0; i < command.length(); i++){
            if('G' == command.charAt(i)){
                result.append("G");
            }
            else
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    result.append("o");
                    ++i;
                } else {
                    result.append("al");
                    i+=3;
                }
            } 
        }
        return result.toString();
    }
}