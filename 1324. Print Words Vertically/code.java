class Solution {
    public List<String> printVertically(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String[] str = s.split(" ");
        
        int index = 0;
        
        while(true){
            sb.setLength(0);
            boolean isChar = false;
            for(int i=str.length-1;i>=0;i--){
                if(index>=str[i].length()){
                    if(isChar) sb.append(" ");
                }else{
                    isChar = true;
                    sb.append(str[i].charAt(index));
                }
            }
            if(!isChar) break;
            index++;
            list.add(sb.reverse().toString());
        }
        
        return list;
    }
}