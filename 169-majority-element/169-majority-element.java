class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = 0;
        
        int curMax = 0;
        int max = 0; 
        int num = nums[0];
        
        while(p2 < nums.length){
            if (nums[p1] == nums[p2]){
                curMax++;
                p2++;
            }
            else{
                curMax = 0;
                p1 = p2;
                //p2++;
            }
            if (curMax > max){
                max = curMax;
                num = nums[p1];

            }
        }
        return num;
    }
}