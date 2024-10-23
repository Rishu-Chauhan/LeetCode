class Solution {
    public int tribonacci(int n) {
       if(n<2){
           return n;
       }
        int t[]={0,1,1};
        for(int i=3;i<=n;i++){
            int next=t[0]+t[1]+t[2];
            t[0]=t[1];
            t[1]=t[2];
            t[2]=next;
        }
        return t[2];
    }
}