class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        // If k is large enough, problem reduces to "unlimited transactions"
        if (2 * k >= n) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i-1]) {
                    maxProfit += prices[i] -  prices[i-1];
                }
            }
            return maxProfit;
        }

        // DP table
        int[][] dp = new int[k + 1][n];
        
        for (int i = 1; i <= k; i++) {
            int maxDiff = -prices[0]; // max(dp[i-1][m] - prices[m])
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - prices[j] );
            }
        }

        return dp[k][n - 1];
    }
}