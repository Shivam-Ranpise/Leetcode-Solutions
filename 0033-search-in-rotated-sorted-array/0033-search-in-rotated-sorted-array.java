class Solution {
    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);
        //if you did not found pivot then just do the simple binary search
        if(pivot == -1){
            return binary_search(nums, target, 0, nums.length - 1);
        }
        //if you found the pivot then,
        if(nums[pivot] == target){
            return pivot;
        }

        // if target element is greater than start element
        if(target >= nums[0]){
            return binary_search(nums, target, 0, pivot - 1);
        }

        return  binary_search(nums, target, pivot + 1, nums.length - 1);
    }
    
    int binary_search(int [] nums, int target, int start ,int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
    
    int FindPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            // fist case
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            // case two
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            //case three
            if(nums[mid] <= nums[start]){
                end = mid -1;
            }
            // case four what if mid is greater than start
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}