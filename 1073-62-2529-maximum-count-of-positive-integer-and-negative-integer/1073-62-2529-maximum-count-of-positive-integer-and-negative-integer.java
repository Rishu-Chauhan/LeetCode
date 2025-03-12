class Solution {
    public int maximumCount(int[] nums) {
        int pCount=0;
        int nCount=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pCount++;
            }
            if(nums[i]<0){
                nCount++;
            }
        }
        return Math.max(nCount,pCount);
    }
}