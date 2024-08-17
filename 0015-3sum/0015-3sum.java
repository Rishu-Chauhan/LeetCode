class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      if(nums==null || nums.length<3){
        return new ArrayList<>();
      }  
      Arrays.sort(nums);
      Set<List<Integer>> result=new HashSet<>();
      for(int i=0;i<nums.length-2;i++){
        int lp=i+1;
        int rp=nums.length-1;
        while(lp<rp){
            int sum=nums[i]+nums[lp]+nums[rp];
            if(sum==0){
                result.add(Arrays.asList(nums[i],nums[lp],nums[rp]));
                 lp++;
                 rp--;
            }
           
             else if(sum<0){
        lp++;
        }
        else{
            rp--;
        }
        }
      }
      return new ArrayList<>(result);
    }
}