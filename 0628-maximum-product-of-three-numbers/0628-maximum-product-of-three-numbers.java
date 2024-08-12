class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int prod=nums[0]*nums[1]*nums[n-1];
        int prd=nums[n-1]*nums[n-2]*nums[n-3];
        int res=Math.max(prod,prd);
        return res;
    }
}