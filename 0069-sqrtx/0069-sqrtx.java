class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int si=1;
        int ei=x;
        int mid=-1;
        while(si<=ei){
             mid=si+(ei-si)/2;
           if((long)mid*mid>(long)x){
               ei=mid-1;
           }
            else if(mid*mid==x){
                return mid;
            }
            else{
                si=mid+1;
            }
        }
     return Math.round(ei);   
    }
}