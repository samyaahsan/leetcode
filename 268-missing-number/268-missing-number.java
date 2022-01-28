class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int target = nums.length;
        
        for (int i = 0; i < target; i++){
            if (nums[i] != i){
                return i;
            }
            else{
                continue;
            }
        }
        return nums.length;
    }
}