class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
         int mini=Integer.MAX_VALUE;
        if(n==2){
            return -1;
        }
        for(int i=0;i<n;i++){
        if(nums[i]>maxi){
            maxi=nums[i];
        }  
        }
         for(int i=0;i<n;i++){
        if(nums[i]<mini){
            mini=nums[i];
        }  
        }
        for(int i=0;i<n;i++){
         if(nums[i]!=maxi && nums[i]!=mini){
           return  nums[i];
         }
        }
        return -1;
    }
}