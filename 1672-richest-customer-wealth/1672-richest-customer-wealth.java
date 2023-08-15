class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = Integer.MIN_VALUE;
        for(int [] m : accounts){
            int sum = 0;
            for(int n : m){
                sum += n;
            }
            if(sum > answer){
                answer = sum;
            }
        }
        return answer;
    }
}