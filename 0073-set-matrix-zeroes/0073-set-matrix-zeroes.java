class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean firstRow = false;
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    //check if first row or not
                    if (i > 0)
                        matrix[i][0] = 0;
                    else
                        firstRow = true;
                }
            }
        }
        
        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        
        if (matrix[0][0] == 0){
            for (int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        
        if (firstRow){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        
    }
}