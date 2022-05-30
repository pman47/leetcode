class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        int i = num.length-1;
        int carry = 0;
        
        while(i>=0){
            int tmp = k%10;
            carry = tmp + num[i--] + carry;
            ans.add(carry%10);
            carry/=10;
            k/=10;
        }
        
        while(k>0){
            int tmp = k%10;
            carry += tmp;
            ans.add(carry%10);
            carry/=10;
            k/=10;
        }
        
        if(carry>0) ans.add(carry);
        Collections.reverse(ans);
        return ans;
    }
}