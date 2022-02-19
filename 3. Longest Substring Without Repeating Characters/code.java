class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuilder nonRepeated = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            int matchIndex = nonRepeated.indexOf(Character.toString(t));
            if (matchIndex !=-1) {
                max = Math.max(max, nonRepeated.length());
                nonRepeated.delete(0,matchIndex+1);
            }
            nonRepeated.append(t);
        }
        return Math.max(max, nonRepeated.length());
    }
}