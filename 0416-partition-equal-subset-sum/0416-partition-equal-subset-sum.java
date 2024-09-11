class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totalSum = calculateSum(nums, n);
        if (totalSum % 2 != 0) {
            return false; 
        }
        return canPartitionSubset(nums, totalSum / 2, n);
    }

    public static int calculateSum(int nums[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static boolean canPartitionSubset(int nums[], int targetSum, int n) {
        boolean[][] dp = new boolean[n + 1][targetSum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= targetSum; j++) {
                if (i == 0) {
                    dp[i][j] = false;
                }
                if (j == 0) {
                    dp[i][j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][targetSum];
    }
}
