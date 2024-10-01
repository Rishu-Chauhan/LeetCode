class Solution {
    public int longestPalindromeSubseq(String s) {
    
        
           int n=s.length();
       
          String s1 = new StringBuilder(s).reverse().toString();
        int t[][]=new int [n+1][n+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<n+1;j++){
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][n];
    }

}