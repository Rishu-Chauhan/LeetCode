class Solution {
    public int minStartValue(int[] nums) {
     int minPrefixSum = 0; 
        int sum = 0;   
         for (int num : nums) {
            sum += num;
            minPrefixSum = Math.min(minPrefixSum, sum);
        }
      return   1 - minPrefixSum;
    }
}