class Solution {
    public int projectionArea(int[][] grid) {
          int n = grid.length;
        int topView = 0, frontView = 0, sideView = 0;
        
        for (int i = 0; i < n; i++) {
            int maxInRow = 0;
            int maxInColumn = 0;
            for (int j = 0; j < n; j++) {
    
                if (grid[i][j] > 0) {
                    topView++;
                }
             
                maxInRow = Math.max(maxInRow, grid[i][j]);
              
                maxInColumn = Math.max(maxInColumn, grid[j][i]);
            }
            frontView += maxInRow;
            sideView += maxInColumn;
        }
        
        return topView + frontView + sideView;
    }
}