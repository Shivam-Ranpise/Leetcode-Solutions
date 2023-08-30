class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int [] result = new int[index.length];
        for(int i = 0; i < index.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}