class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int res[]=new int[n*2];
        for(int i=0;i<n;i++){
            res[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            int rev=0;
            int m=nums[i];
            while(m>0){
                rev=rev*10+m%10;
                m=m/10;
            }
            res[n+i]=rev;
        }
        for(int i=0;i<res.length;i++){
            set.add(res[i]);
        }
        return set.size();
    }
}