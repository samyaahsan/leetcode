class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int h = nums.length-1;
        int mid = (h - l) + l / 2;
        
        while (l <= h){
            mid = (h - l) + l / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target){
                l = mid + 1;
            }
            else
                h = mid - 1;

        }
        
        return -1;
        
    }
}