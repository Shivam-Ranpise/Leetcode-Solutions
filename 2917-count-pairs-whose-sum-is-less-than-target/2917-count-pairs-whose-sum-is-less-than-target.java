class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i, j;
        int count = 0;
        for(i = 0; i < nums.size(); i++){
            for(j = i + 1; j< nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
                    
            }
        }   
        return count;
    }
}