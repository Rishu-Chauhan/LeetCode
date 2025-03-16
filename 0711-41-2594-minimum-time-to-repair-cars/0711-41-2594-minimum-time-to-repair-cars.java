class Solution {
    public long repairCars(int[] ranks, int cars) {
        long lo=1,hi=(long)1e14;
        long ans=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            long canRepair=0;
            for(int r:ranks){
                canRepair += (long)Math.sqrt(mid/r);
            }
            if(canRepair >= cars){
                hi =mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}