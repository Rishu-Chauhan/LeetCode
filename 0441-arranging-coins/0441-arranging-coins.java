class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;
            n=n-i;
        }
        int m=i-1;
        return m;
    }
}