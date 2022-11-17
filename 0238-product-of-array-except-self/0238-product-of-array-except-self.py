class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        res = []
        
        prefix = 1
        for i in range(len(nums)):
            res.append(prefix)
            prefix *= nums[i]
            
        postfix = 1
        for i, elem in reversed(list(enumerate(nums))):
            res[i] = postfix * res[i]
            postfix = postfix * nums[i]
            
        return res
            
            
        