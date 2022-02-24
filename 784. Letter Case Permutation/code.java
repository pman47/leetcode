class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> letterCasePermutation(String s) {
        permute(s.toCharArray(), 0, s.length());
        return res;
    }
    
    public void permute(char[] s, int l, int r) {
        if(l >= r) {
            res.add(new String(s));
            return;
        }
        
		// If s[l] is not a alphabet simply increase the l value by 1.
        if(!Character.isAlphabetic(s[l])) {
            permute(s, l+1, r);
            return;
        }
        
        // For lowercase
        s[l] = Character.toLowerCase(s[l]);
        permute(s, l+1, r);
        
        // For uppercase
        s[l] = Character.toUpperCase(s[l]);
        permute(s, l+1, r);
    }
}