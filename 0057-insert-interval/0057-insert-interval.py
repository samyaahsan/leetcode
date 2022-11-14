class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        res = []
        
        for i in range(len(intervals)):
            #if it is less than, then it is less than the rest of the list, too
            if newInterval[1] < intervals[i][0]:
                res.append(newInterval)
                return res + intervals[i:]
            
            #if the interval is greater than what's there
            elif newInterval[0] > intervals[i][1]:
                res.append(intervals[i])
            
            #merge
            else:
                newInterval = [min(intervals[i][0], newInterval[0]), max(intervals[i][1], newInterval[1])]
                
        res.append(newInterval)
        return res