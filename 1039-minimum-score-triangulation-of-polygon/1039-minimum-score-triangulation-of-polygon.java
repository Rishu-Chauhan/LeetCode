class Solution {
    static int t[][]=new int[101][101];
    public int minScoreTriangulation(int[] values) {
        
        for (int i = 0; i < 101; i++) {
            Arrays.fill(t[i], -1);
        }
        
        // Solve the matrix chain multiplication problem
        return solve(values, 1, values.length- 1);
    }
    
    static int solve(int values[], int i, int j) {
        if (i >= j) {
            return 0;
        }
        
        if (t[i][j] != -1) {
            return t[i][j];
        }
        
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) { // Fixed loop condition
            int temp = solve(values, i, k) + solve(values, k + 1, j) + values[i - 1] * values[k] * values[j];
            if (temp < min) {
                min = temp;
            }
        }
        
        return t[i][j] = min;
    }
}