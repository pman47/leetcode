class Solution {
    public int maxProduct(String[] words) {
        List<Integer> word_int=new ArrayList<>();
        for(String s:words){
          int mask=0;
          for(char i:s.toCharArray()){
            mask |= 1<<(i-'a');
          }
          word_int.add(mask);
        }
        
      int res=0;
      for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
          if((word_int.get(i) & word_int.get(j)) == 0){
            res=Math.max(res,words[i].length() * words[j].length());
          }
        }
      }
      
      return res;
    }
}