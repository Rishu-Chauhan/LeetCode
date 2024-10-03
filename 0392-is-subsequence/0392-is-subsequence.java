class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int d[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            d[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            d[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    d[i][j]=1+d[i-1][j-1];
                }
                else{
                    d[i][j]=Math.max(d[i-1][j],d[i][j-1]);
                }
            }
        }
        int lcs=d[n][m];
        if(lcs==s.length()){
            return true;
        }
        return false;
    }
}