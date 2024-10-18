class Solution {
    public int countMaxOrSubsets(int[] nums) {
          int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        return countMaxOrSubsetsHelper(nums, 0, 0, maxOr);
    }

    private int countMaxOrSubsetsHelper(int[] nums, int index, int currentOr, int maxOr) {
        if (index == nums.length) {
            return currentOr == maxOr ? 1 : 0;
        }

        int include = countMaxOrSubsetsHelper(nums, index + 1, currentOr | nums[index], maxOr);
        int exclude = countMaxOrSubsetsHelper(nums, index + 1, currentOr, maxOr);

        return include + exclude;
    }
}