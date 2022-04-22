class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int index=0;
        if(s1.equals(s2))
            return true;
        
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i) && count==0) {
                count++;
                index=i;
            } else if(s1.charAt(i) != s2.charAt(i)) {
                if(s1.charAt(index) != s2.charAt(i) || s2.charAt(index) != s1.charAt(i))
                    return false;
                else
                    count++;
            }
        }
        if(count != 2)
            return false;
        
        return true;
    }
}