class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int currMax = arr[0];
        int max = currMax;
        
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > currMax){
                currMax = arr[i];
            }
            if (max < currMax){
                max = currMax;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}