class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count =0;
        int res[]=new int [101];
        for(int num:nums){
            res[num]++;
        }
        for(int number:res){
            number=number*(number-1)/2;
            count+=number;
        }
        return count;
    }
}