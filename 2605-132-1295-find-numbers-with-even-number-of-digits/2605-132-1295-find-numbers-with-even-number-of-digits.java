class Solution {
    public int findNumbers(int[] nums) {
      int count=0;
      for(int i=0;i<nums.length;i++){
        if(countDigit(nums[i]) % 2==0){
            count++;
        }
      }
      return count;
        
    }
    private int countDigit(int n){
          int count=0;
          n=Math.abs(n);
        while(n>0){
            count++;
            n /=10;
    }
    return count;
}
}