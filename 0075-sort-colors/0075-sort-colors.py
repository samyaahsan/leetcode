class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l, r = 0, len(nums)-1
        i = 0
        
        def swap(p, i):
            temp = nums[i]
            nums[i] = nums[p]
            nums[p] = temp

        while i <= r:
            #see a 0, swap with left
            if nums[i] == 0:
                swap(l, i)
                l += 1
            #see a 2, swap with right, don't increment i
            elif nums[i] == 2:
                swap(r, i)
                r -=1
                i -= 1
            #increment i
            i += 1
            
        