class Solution {
    
    private int[] swap(int[] nums, int p1, int p2){
      int temp = nums[p1];
      nums[p1] = nums[p2];
      nums[p2] = temp;
      return nums;
    }
    
    
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        
        while(p1 < nums.length){
            while (p2 < nums.length){
                if (nums[p1] < nums[p2]){
                    nums = swap(nums, p1, p2);
                }
                p2++;
            }
            p2 = 0;
            p1++;
        }
        
        
        
    }
}