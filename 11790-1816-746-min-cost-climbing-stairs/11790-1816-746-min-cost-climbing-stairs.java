class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int t[]=new int[n+1];
        t[0]=0;
        t[1]=0;
        for(int i=2;i<n+1;i++){
            t[i]=Math.min(cost[i-1]+t[i-1],cost[i-2]+t[i-2]);
        }
        return t[n];
    }
}