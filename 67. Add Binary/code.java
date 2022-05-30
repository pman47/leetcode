class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1; //at the last index of the string
        int j=b.length()-1;
        
        int sum=0,carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0)
        {
            sum=carry;
            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0)
                sum+=b.charAt(j--)-'0';
            carry=sum>1?1:0;
            ans.append(sum%2);
        }
        if(carry!=0)
            ans.append(carry);
        
        return ans.reverse().toString();
        
        
    }
}