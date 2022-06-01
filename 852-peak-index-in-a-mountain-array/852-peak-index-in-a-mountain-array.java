class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, h = arr.length - 1;
        
        
        while (l < h){
            int mid = l + (h - l) / 2;
            if (arr[mid] < arr[mid + 1]){
                l = mid + 1;
            }
            else{
                h = mid;
            }
        }
        return l;
    }
}

/* O(N) SOLUTION:
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
*/