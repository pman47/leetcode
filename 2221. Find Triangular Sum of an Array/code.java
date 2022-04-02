class Solution {
    public int triangularSum(int[] nums) {
        return printTriangle(nums);
    }
    
    public static int printTriangle(int[] A)
    {
        if(A.length==1){
            return A[0]%10;
        }
        
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = (A[i] + A[i + 1])%10;
            temp[i] = x;
        }
   
        return printTriangle(temp);
   
    }
}