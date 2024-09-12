class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // Check if the target is achievable
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }
        
        int s = (sum + target) / 2;
        if (s < 0) {
            return 0;
        }
        
        int n = nums.length;
        int[][] dp = new int[n + 1][s + 1];
        
        // Initialize the dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= s; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][s];
    }
}
