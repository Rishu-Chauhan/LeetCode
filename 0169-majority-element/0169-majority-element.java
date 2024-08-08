class Solution {
    public int majorityElement(int[] nums) {
       int condidate=nums[0];
       int count=0;
       for(int i:nums){
          if(i==condidate){
            count++;
          }
          else{
            count--;
            if(count==0){
                condidate=i;
                count++;
            }
          }
       }
       return condidate;
    }
}