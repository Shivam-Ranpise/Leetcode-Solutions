class Solution {
    public int[] getConcatenation(int[] nums) {
        /* brutforce approch..........
        
        
        int n = 2 * nums.length;
        int [] ans = new int[n];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        int index = nums.length;
        for(int i = 0; i < nums.length; i++){
            ans[index] = nums[i];
            index++;
        }
        return ans;
        
        */
        
        /* first optimized approch....... (1 ms 90.88% faster & memory 44.1 MB 88.30%  less)
        
        int n = 2 * nums.length;
        int [] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i % nums.length];
        }
        return ans;
        
        */
        
        //second optimized approch.....
        
        int n = nums.length;
        int [] ans = new int[2 * n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}