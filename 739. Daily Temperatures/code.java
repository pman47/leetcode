class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 0)return new int[0];
        int[] answer = new int[temperatures.length];
        int hottest = 0;
        int days = 1;  
        for(int i = temperatures.length-1; i>=0; i--){
            
            if(temperatures[i] >= hottest){
                hottest = temperatures[i];
                continue;
            }    
            days = 1;
            while(temperatures[i+days] <= temperatures[i]){
                days = days+answer[i+days];
            }
            answer[i] = days;
        }  
        return answer;
    }
}