class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if(n == 1 || n == 7){
            return true;
        }
        if(n>=2 && n<=9){
            return false;
        }
        while(n!=0){
            int rem = n%10;
            sum+= rem*rem;
            n /= 10;
        }
        System.out.println(sum);
        return isHappy(sum);
    }
}