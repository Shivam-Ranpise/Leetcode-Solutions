class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2 * n];
        int j = 0;
        for(int i = 0; i < n; i++){
            array[j] = nums[i];
            j += 2;
        }
        int k = 1;
        for(int i = n; i < 2 * n; i++){
            array[k] = nums[i];
            k += 2;
        }
        return array;
    }
}