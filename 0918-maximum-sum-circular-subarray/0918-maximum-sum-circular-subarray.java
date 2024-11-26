class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
      int maxNormalSum=kadane(nums);
       int totSum=0;
       
       for(int i=0;i<nums.length;i++){
           totSum+=nums[i];
           nums[i]=-nums[i];
       }
       
       int maxInvertSum=kadane(nums);
       int maxCirSum=totSum+maxInvertSum;
       
       if(maxCirSum==0){
           return maxNormalSum;
       }
        return Math.max(maxNormalSum,maxCirSum);
       
    }
    public int kadane(int nums[]){
        int n=nums.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++){
            cs+=nums[i];
            if(cs>ms){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
}