class Solution {
    public int distinctAverages(int[] nums) {
       Arrays.sort(nums);
        Set<Double> averages = new HashSet<>();
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            averages.add(avg);
            left++;
            right--;
        }
        
        return averages.size();
    }
}