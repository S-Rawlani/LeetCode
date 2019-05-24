class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int low = 0;
        int high = nums.length -1;
        while(low < high){
            int middle = (low+high)/2;
            if(nums[middle] < nums[high]){
                high = middle;
            }
            else{
                low = middle + 1;
            }
        }
        int pivot = low;
        low = 0;
        high = nums.length -1;
        while(low <= high){
            int mid = (low + high)/2;
            int rotated_mid = (mid + pivot) % nums.length;
            if(nums[rotated_mid] == target)
                return rotated_mid;
            else if (nums[rotated_mid] < target){
                low = mid + 1;
            }
            else
                high = mid-1;
        }
       return -1;
    }
}