class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prefix = 1;
        int postfix = 1;
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix = nums[i] * prefix;
        }
        
        for (int i = nums.length-1; i >= 0; i--){
            answer[i] = answer[i] * postfix;
            postfix = nums[i] * postfix;
        }
        
        return answer;
        
    }
}