class Solution {
    public int[] twoSum(int[] nums, int target) {
        //edge cases: nums is empty or 1 value
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length-1; j > 0; j--){
                if (nums[i] + nums[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
        
    }
}