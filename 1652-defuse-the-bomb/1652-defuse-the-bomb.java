class Solution {
    public int[] decrypt(int[] code, int k) {
       int n=code.length;
        int sum=0;
        int temp[]=new int[n];
        if(k==0){
            return temp;
        }
        for(int i=0;i<n;i++){
            if(k>0){
                for(int j=i+1;j<i+k+1;j++){
                    temp[i]+=code[j%n];
                }
            }
            else{
                for(int j=i-Math.abs(k);j<i;j++){
                    temp[i]+=code[(j+n)%n];
                }
            }
        }
        return temp;
    }
}