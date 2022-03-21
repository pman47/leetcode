// FIRSTTTTTTTTTTTTTT
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            ans+=map.getOrDefault(jewels.charAt(i),0);
        }
        return ans;
    }
}

// SECONDDDDDDDDDDDD
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set setJ = new HashSet();
        for (char j: jewels.toCharArray())
            setJ.add(j);
        for (char s: stones.toCharArray())
            if (setJ.contains(s)) res++;
        return res;
    }
}
