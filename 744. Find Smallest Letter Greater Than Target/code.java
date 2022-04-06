class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(target-'a'>=letters[n-1]-'a' || target-'a'<letters[0]-'a') return letters[0];
        
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(letters[mid]-'a'==target-'a' && letters[mid]!=letters[mid+1]) return letters[mid+1];  //if we find char same as target
            else if(letters[mid]-'a'<target-'a' && letters[mid+1]-'a'>target-'a') return letters[mid+1]; //if target is between two elements
            else if(letters[mid]-'a'>target-'a') high=mid-1;
            else low = mid+1;
        }
        return 'a';
    }
}