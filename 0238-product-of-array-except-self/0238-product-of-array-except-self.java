class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        
        int prefix = 1;
        for (int i = 0; i < size; i++){
            ans[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        int postfix = 1;
        for (int j = size-1; j >= 0; j--){
            ans[j] = ans[j] * postfix;
            postfix = postfix * nums[j];
        }
        
        return ans;
        
        
        
    }
}