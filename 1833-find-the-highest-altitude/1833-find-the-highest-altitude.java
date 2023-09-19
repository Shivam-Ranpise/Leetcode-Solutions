class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int large = gain[0];
           for(int i = 1; i< n; i++){
            gain[i] = gain[i] + gain[i-1];
            if(gain[i] > large){
               large = gain[i];
            }
        }

        return Math.max(large, 0);
    }
}