class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if (matrix.length == 0)
            return spiral;
        
        int rowBegin = 0, rowEnd = matrix.length-1;
        int colBegin = 0, colEnd = matrix[0].length-1;
        
        while (colBegin <= colEnd && rowBegin <= rowEnd){
            for (int j = colBegin; j <= colEnd; j++){
                spiral.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            for (int i = rowBegin; i <= rowEnd; i++){
                spiral.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd){
                for (int j = colEnd; j >= colBegin; j--){
                    spiral.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd){
                for (int i = rowEnd; i >= rowBegin; i--){
                    spiral.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        
        return spiral;
    }
}