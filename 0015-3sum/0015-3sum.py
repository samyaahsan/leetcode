class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        
        for i, curr in enumerate(nums):
            if i > 0 and curr == nums[i-1]:
                continue
                
            l, r = i + 1, len(nums) - 1
            
            while (l < r):
                three_sum = curr + nums[l] + nums[r]
                if three_sum > 0:
                    r -= 1
                elif three_sum < 0:
                    l += 1
                else:
                    res.append([curr, nums[l], nums[r]])
                    l += 1
                    while l < r and nums[l-1] == nums[l]:
                        l += 1
        
        return res
                