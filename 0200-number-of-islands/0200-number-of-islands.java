class Solution {
    public int numIslands(char[][] grid) {
        
        int numOfIslands = 0;
        
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    numOfIslands++;
                    checkIsland(grid, i, j);
                }
            }
        }
        return numOfIslands;
        
    }
    
    public void checkIsland(char[][] grid, int i, int j){
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0
           || grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        checkIsland(grid, i+1, j);
        checkIsland(grid, i-1, j);
        checkIsland(grid, i, j+1);
        checkIsland(grid, i, j-1);
    }
}