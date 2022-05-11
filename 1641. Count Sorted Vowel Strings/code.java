// METHOD 1
class Solution {
    public int countVowelStrings(int n) {
        int[] pre = {1,2,3,4,5};
        n--;
        while(n-->0){
            int sum = 0;
            for(int i=0; i<pre.length; i++){
                sum += pre[i];
                pre[i] = sum;
            }
        }
        return pre[4];
    }
}

// METHOD 2
class Solution {
    public int countVowelStrings(int n) {
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }
}