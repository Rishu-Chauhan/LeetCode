class Solution {
    public int findLength(int[] nums1, int[] nums2) {
      int n=nums1.length;
        int m=nums2.length;
        int t[][]=new int[n+1][m+1];
        int maxLen=0;
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
           t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(nums1[i-1]==nums2[j-1]){
                    t[i][j]=t[i-1][j-1]+1;
                    maxLen=Math.max(maxLen,t[i][j]);
                }
                else{
                    t[i][j]=0;
                }
            }
        }
        return maxLen;
    }
}