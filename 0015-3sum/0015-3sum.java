class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++){
            if (i == 0 || nums[i-1] != nums[i]){
                threeSum(nums, i, ans);
            }
        }
        return ans;
        
    }
    
    void threeSum(int[] nums, int i, List<List<Integer>> ans){
        int l = i + 1, h = nums.length -1;
        while (l < h){
            int sum = nums[i] + nums[l] + nums[h];
            if (sum < 0){
                ++l;
            }
            else if (sum > 0){
                --h;
            }
            else{
                ans.add(Arrays.asList(nums[i], nums[l], nums[h]));
                ++l;
                //--h;
                while (l < h && nums[l-1] == nums[l]){
                    ++l;
                }
            }
        }
    }
}