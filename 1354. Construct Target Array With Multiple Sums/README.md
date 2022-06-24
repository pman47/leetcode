<pre>
class Solution {
  public boolean isPossible(int[] target) {
    if(target.length == 1) return target[0] == 1;     //special case for length = 1
    
    long sum = 0;
    
    PriorityQueue<Integer> q = new PriorityQueue<>(target.length,(o1, o2) -> o2 - o1);
    for(int n: target){                              //add all elements in pq and calculate their sum
      sum += n;
      q.add(n);
    }
    
    while(true){
      int n = q.poll();                 //fetch the greatest element           
      if(n == 1) return true;           //if greatest element is equal 1 : we have array with only ones
      
      sum -= n;                         //calculate sum other elements (without the greatest)
      if(sum >= n) return false;        //if sum not less then n - we can't have such element in right array
      if(sum == 1) return true;    //if sum is equal 1 - we have special case with length = 2 and good oportunities 
      
      n %= (int)sum;               //will use % as multiple subtructing
      if(n == 0) return false;     //we can't have element is equal 0
      sum += n;                    //refresh sum
      q.add(n);                    //refresh priority queue
    }
    
  }
}
</pre>
