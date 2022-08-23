class Solution {
	public int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;

		// Sort by ascending starting point
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int []> merged = new ArrayList<>();
        int[] currInterval = intervals[0];
        merged.add(currInterval); //bc we added it here
        
        for(int[] interval: intervals){
            if(currInterval[1] >= interval[0]){
                currInterval[1] = Math.max(currInterval[1], interval[1]); //changes in output array by reference ^^
            }
            else{
                currInterval = interval;
                merged.add(currInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
}
}   

//KEEP TRACK OF THE CURRENT INTERVAL -- WE ALWAYS MOVE THROUGH INTERVALS, BUT WE JUST ACTUALLY CARE ABOUT WHAT OUR CURRENT INTERVAL IS MERGING OR NOT!!!