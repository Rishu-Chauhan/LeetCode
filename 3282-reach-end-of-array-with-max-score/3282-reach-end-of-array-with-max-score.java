class Solution {
    public long findMaximumScore(List<Integer> nums) {
         long res = 0, ma = 0;
        for (int a: nums) {
            res += ma;
            ma = Math.max(ma, a);
        }
        return res;
    }
}