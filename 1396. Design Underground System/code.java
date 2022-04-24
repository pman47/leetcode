class UndergroundSystem {
    // to store the checkin time of that id on particular station
    HashMap<Integer,Pair<String,Integer>> mp1;
    
    /* to store the diff between checkin and checkout time between that
       particular stations*/
    HashMap<Pair<String,String>,List<Integer>> mp2;

    public UndergroundSystem() {
        mp1 = new HashMap(); //initialization
        mp2 = new HashMap(); //initialization
    }
    
    public void checkIn(int id, String stationName, int t) {
        /* since once can checkout at one station only at a time so that's why 
           we're using putIfAbsent here. This will put into map only if user
           not chekin somewhere at that time*/
        mp1.putIfAbsent(id, new Pair<>(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        int diff = t - mp1.get(id).getValue(); // diff b/w checkin and checkout
        Pair<String,String> p = new Pair<>(mp1.get(id).getKey(), stationName);
        /*
         we're removing that id because once person checkout from that station
         then he can checkin further 
        */
        mp1.remove(id); 
        /*
            check if anyother have travelled b/w same stations
        */
        if(mp2.get(p) == null){
            List<Integer> diffs = new ArrayList<>();
            diffs.add(diff);
            mp2.put(p, diffs);
        }
        /*
            if yes then we'll update the travel time list
        */
        else{
            mp2.get(p).add(diff);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Pair<String, String> p = new Pair<>(startStation, endStation);
        List<Integer> avg = mp2.get(p);
        /*
            gives the avg of total travel time b/w given stations 
            by taking avg of travel time of all visitors
        */
        double ans = (avg.stream().mapToDouble(Integer::intValue).sum())/avg.size();
        return ans;
    }
}