class Solution {
    public int jump(int[] nums) {
             int n=nums.length;
     if(n==0 || nums[0]==0){
         return 0;
     }
     int jump[]=new int[n];
     Arrays.fill(jump,Integer.MAX_VALUE);
      jump[0]=0;
     for(int i=1;i<n;i++){
         for(int j=0;j<i;j++){
             if(i<=j+nums[j]  && jump[j]!=Integer.MAX_VALUE){
                 jump[i]=Math.min(jump[i],jump[j]+1);
             }
         }
     }
     return jump[n-1]==Integer.MAX_VALUE ? -1 : jump[n-1];
    }
}