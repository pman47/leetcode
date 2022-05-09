// Easy Method Recursion
class Solution {
    List<String> list = new ArrayList<>();
	List<String> k = new ArrayList<>(Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));

	public void fun(String s,int start,String str)
	{
		if(start==s.length())
		{
			list.add(str);
			return;
		}
		String x = k.get(s.charAt(start)-'0');
		for(int i=0;i<x.length();i++)
			fun(s,start+1,str+x.charAt(i));
	}

	public List<String> letterCombinations(String digits) 
	{
		if(digits.length()==0)
			return list;
		fun(digits,0,"");
		return list;
	}
}

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        
        return phone(digits,"");
    }
    static List<String> phone(String str, String p) {
        if (str.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> list = new ArrayList<>();
        int digit = str.charAt(0) - '0';
        int start = (digit - 2) * 3;
        int end = (digit - 1) * 3;
        if (digit == 7){
            end = ((digit - 1) * 3) + 1;
        }
        if (digit == 8) {
            start = ((digit - 2) * 3) + 1;
            end = ((digit - 1) * 3) + 1;
        }
        if (digit == 9) {
            start = ((digit - 2) * 3) + 1;
            end = ((digit - 1) * 3) + 2;
        }
        for (int i = start; i < end; i++) {
            char ch = (char) (i + 'a');
            list.addAll(phone(str.substring(1), p + ch));
        }
        return list;
    }
}