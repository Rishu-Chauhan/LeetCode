class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
         int n = nums.length;
        int left = 0, right = queries.length;
        int result = -1;

        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canAchieveZeroArray(nums, queries, mid)) {
                result = mid; 
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private boolean canAchieveZeroArray(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] decrements = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            decrements[l] += val;
            if (r + 1 < n) {
                decrements[r + 1] -= val;
            }
        }

        
        int currentDecrement = 0;
        for (int i = 0; i < n; i++) {
            currentDecrement += decrements[i];
            if (currentDecrement < nums[i]) {
                return false; 
            }
        }

        return true;
    
    }
}