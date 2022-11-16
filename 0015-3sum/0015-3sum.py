class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        
        for i, curr in enumerate(nums):
            #i is the index
            #curr is the current element
            if i > 0 and curr == nums[i-1]:
                continue
                
            l, r = i + 1 , len(nums) - 1
            #left is i + 1 because curr is the first element, so we want to get the rest
            while l < r:
                three_sum = curr + nums[l] + nums[r]
                if three_sum > 0:
                    r -= 1
                elif three_sum < 0:
                    l += 1
                else:
                    res.append([curr, nums[l], nums[r]])
                    l += 1 #keep counter moving, only have to handle one case
                    while nums[l-1] == nums[l] and l < r: #get rid of duplicates
                        l += 1
            
        return res
         
        