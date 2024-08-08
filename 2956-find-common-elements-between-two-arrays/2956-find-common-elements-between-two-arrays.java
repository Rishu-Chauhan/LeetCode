class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int countn=0;
        int countm=0;
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                  countn++;
                  break;
                }
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums2[i]==nums1[j]){
                  countm++;
                  break;
                }
            }
        }
        return new int[]{countn,countm};
    }
}