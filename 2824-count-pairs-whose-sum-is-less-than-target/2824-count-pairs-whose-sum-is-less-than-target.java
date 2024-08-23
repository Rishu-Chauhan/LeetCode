class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int si=0;
        int ei=nums.size()-1;
        int count=0;
        while(si<ei){
            if(nums.get(si)+nums.get(ei)<target){
                 count += (ei - si); 
                si++;
            }
            else{
                ei--;
            }
        }
        return count;
    }
}