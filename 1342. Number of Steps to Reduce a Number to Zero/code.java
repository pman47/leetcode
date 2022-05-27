class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        for(;num>0;steps++) num = (num%2==1)?num-1:num/2;
        return steps;
    }
}