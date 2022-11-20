class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        intervals.sort()
        
        new_interval = intervals[0]
        
        for i in range (len(intervals)-1):
            i+=1
            if new_interval[1] >= intervals[i][0]:
                new_interval = [min(new_interval[0], intervals[i][0]), max(new_interval[1], intervals[i][1])]
            if new_interval[1] < intervals[i][0]:
                res.append(new_interval)
                new_interval = intervals[i]
                
        res.append(new_interval)
        return res
        