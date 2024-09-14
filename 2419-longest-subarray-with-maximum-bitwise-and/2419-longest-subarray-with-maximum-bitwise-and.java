class Solution {
    public int longestSubarray(int[] nums) {
     int currLength=0;
        int maxLength=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                currLength++;
                maxLength=Math.max(currLength,maxLength);
            }
            else{
                currLength=0;
            }
        }
        return maxLength;
    }
}