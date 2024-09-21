class Solution {
    public int countSquares(int[][] matrix) {
        int t[][]=new int [matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            t[i][0]=matrix[i][0];
        }
         for(int j=0;j<matrix[0].length;j++){
            t[0][j]=matrix[0][j];
         }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    t[i][j]=0;
                }
                else{
                    t[i][j]=1+Math.min(t[i-1][j],Math.min(t[i-1][j-1],t[i][j-1]));
                }
            }
        }
             
             int sum=0;
             for(int i=0;i<matrix.length;i++){
                 for(int j=0;j<matrix[0].length;j++){
                     sum+=t[i][j];
                 }
             }
             return sum;
    }
}