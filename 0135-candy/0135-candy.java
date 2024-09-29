class Solution {
    public int candy(int[] ratings) {
     int n= ratings.length;
        int lr[]=new int [n];
        lr[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                lr[i]=lr[i-1]+1;
            }
            else{
                lr[i]=1;
            }
        }
        int rl[]=new int[n];
        rl[n-1]=1;
        for(int j=n-2;j>=0;j--){
            if(ratings[j]>ratings[j+1]){
                rl[j]=rl[j+1]+1;
            }
            else{
                rl[j]=1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.max(lr[i],rl[i]);
        }
        return sum;
    }
}