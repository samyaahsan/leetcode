class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        //check if can be placed before
        
        //check if can be placed after
        
        //else, it is merging
        //min of left points, max of right points
        
        List<int[]> result = new LinkedList<>();
        int i = 0;
        
        while (i < intervals.length && intervals[i][1] < newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        
        result.add(newInterval);
        
        while (i < intervals.length){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}