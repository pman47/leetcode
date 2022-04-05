class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String shortest = null;
        int min = Integer.MAX_VALUE;
        for(String s: strs) {
            if(s.length() < min) {
                min = s.length();
                shortest = s;
            }
        }
        
        int end = -1;
        for (int i = 0; i < shortest.length(); i++) {
            char c = shortest.charAt(i);
            boolean prefix = true;
            for (String s: strs) {
                if (s.charAt(i) != c) {
                    prefix = false;
                    break;
                }
            }
            if (prefix) {
                end = i;
            } else {
                break;
            }
        }
        
        if(end < 0) {
            return "";
        } else {
            return shortest.substring(0, end + 1);
        }
    }
}