class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        
        def dfs(i, curr_combo, total):
            #base cases
            if total == target: #success
                res.append(curr_combo.copy())
                return
            if i >= len(candidates) or total > target: #failure
                return
            
            #branching
            #include
            curr_combo.append(candidates[i])
            dfs(i, curr_combo, total + candidates[i])
            curr_combo.pop()
            
            #exclude
            dfs(i+1, curr_combo, total)
            
        dfs(0, [], 0)
        return res
                
        