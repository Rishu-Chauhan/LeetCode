class Solution {
    public int maximalRectangle(char[][] matrix) {
       int currRow[]=new int[matrix[0].length];
        int maxAns=largestRectangleArea(currRow);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    currRow[j]+=1;
                }
                else{
                    currRow[j]=0;
                }
            }
            int currAns=largestRectangleArea(currRow);
            maxAns=Math.max(maxAns,currAns);
        }
        return maxAns;
    }
     public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        int nsl[]=new int [n];
        int nsr[]=new int [n];
        Stack<Integer> s=new Stack<>();
       
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        
         for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        
        
        for(int i=0;i<n;i++){
            int h=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=h*width;
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
}
}