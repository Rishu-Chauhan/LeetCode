class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap=0;
        for(int i=1;i<nums.length;i++){
            int maxi=nums[i]-nums[i-1];
            maxGap=Math.max(maxGap,maxi);
        }
        return maxGap;
    }
}