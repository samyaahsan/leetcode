class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    islands++;
                    isIsland(grid, i, j);
                }
            }
        }
        return islands;
    }
    
    private void isIsland(char[][]grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        
        grid[i][j] = '0';
        isIsland(grid, i + 1, j);
        isIsland(grid, i - 1, j);
        isIsland(grid, i, j + 1);
        isIsland(grid, i, j - 1);
    }
}