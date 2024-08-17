class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
        int resultSum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;
      for(int i=0;i<nums.length-2;i++){
        int lp=i+1;
        int rp=nums.length-1;
        while(lp<rp){
            int sum=nums[i]+nums[lp]+nums[rp];
            if(sum==target){
               return target;
            }
             else if(sum<target){
        lp++;
        }
        else{
            rp--;
        }
            int diffToTarget=Math.abs(sum-target);
            if(diffToTarget<minDiff){
                resultSum=sum;
                minDiff=diffToTarget;
            }
        }
      }
        return resultSum;
    }
}