class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        int res=meetings[0][0]-1;
        int last=meetings[0][1];
        for(int i=0;i<meetings.length;i++){
            if(meetings[i][0]>last+1){
                res +=(meetings[i][0]-last-1);
            }
         last=Math.max(last,meetings[i][1]);
        }
            if (last < days) {
            res += (days - last);
        }
        return res;
    }
}