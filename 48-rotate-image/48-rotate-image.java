class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                System.out.println(matrix[i][j]);
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-j-1] = temp;
            }
        }
        
    }
}