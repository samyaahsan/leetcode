class Solution {
    public int maxSubArray(int[] nums) {
        int currBest = nums[0], max = currBest;
        
        for (int i = 1; i < nums.length; i++){
            currBest = Math.max(nums[i], nums[i] + currBest);
            max = Math.max(currBest, max);
        }
        return max;
    }
}