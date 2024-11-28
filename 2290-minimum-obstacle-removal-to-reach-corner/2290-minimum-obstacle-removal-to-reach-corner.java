import java.util.*;

class Solution {
    // Directions for moving up, right, down, and left
    private final int[] row = {-1, 0, 1, 0};
    private final int[] col = {0, 1, 0, -1};

    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];

        for (int[] row : ans) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        Queue<int[]> q = new LinkedList<>();
        ans[0][0] = 0;
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int x = node[0], y = node[1];

            for (int k = 0; k < 4; k++) {
                int nr = row[k] + x;
                int nc = col[k] + y;

                if (isValid(nr, nc, m, n) && ans[nr][nc] > ans[x][y] + grid[nr][nc]) {
                    ans[nr][nc] = ans[x][y] + grid[nr][nc];
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return ans[m-1][n-1];
    }

    private boolean isValid(int x, int y, int m, int n) {
        return x >= 0 && y >= 0 && x < m && y < n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
            {0, 1, 1},
            {1, 1, 0},
            {1, 1, 0}
        };
        System.out.println("Minimum Obstacles: " + solution.minimumObstacles(grid));
    }
}
