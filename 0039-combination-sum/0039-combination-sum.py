class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        
        def dfs(i, curr_combo, total):
            if total == target:
                res.append(curr_combo.copy())
                return
            if total > target or i >= len(candidates):
                return
            
            curr_combo.append(candidates[i])
            dfs(i, curr_combo, total+candidates[i])
            curr_combo.pop()
            
            dfs(i+1, curr_combo, total)
            
        dfs(0, [], 0)
        return res