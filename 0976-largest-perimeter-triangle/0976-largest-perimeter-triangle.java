class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>1;i--){
            int a=nums[i-2];
            int b=nums[i-1];
            int c=nums[i];
            int triSum=a+b+c;
            if(a+b>c){
                return triSum;
            }
        }
        return 0;
    }
}