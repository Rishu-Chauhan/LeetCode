class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }
        int t[]=new int[n];
        t[0]=nums[0];
        t[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            t[i]=Math.max(t[i-2]+nums[i],t[i-1]);
        }
        return t[n-1];
    }
}