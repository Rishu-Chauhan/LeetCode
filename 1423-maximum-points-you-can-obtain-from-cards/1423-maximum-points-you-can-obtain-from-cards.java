class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int n=cardPoints.length;
        int tot_sum=0;
        for(int i=0;i<n;i++){
            tot_sum+=cardPoints[i];
        }
        int si=0;
        int ei=n-k;
        int winSum=0;
        for(int i=si;i<ei;i++){
            winSum+=cardPoints[i];
        }
       int minWinSum = winSum;

        for (int i = ei; i < n; i++) {
            winSum += cardPoints[i] - cardPoints[i - ei];
            minWinSum = Math.min(minWinSum, winSum);
        }

        return tot_sum - minWinSum;
    }
}