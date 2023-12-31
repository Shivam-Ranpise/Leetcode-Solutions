class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        // binary Search

        while (start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int partitions = 1;

            for(int num : nums) {
                if(sum + num > mid){
                    sum = num;
                    partitions++;
                }
                else{
                    sum = sum + num;
                }
            }
            if(partitions > k){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}