class Solution {
    public double largestTriangleArea(int[][] points) {
         double area=0;
        for(int[] A:points)
        {
            for(int[] B:points)
            {
                for(int[] C:points)
                {
                    area=Math.max(area,0.5*calcArea(A,B,C));
                }
            }
        }
        return area;
    }
    public double calcArea(int[] A,int[] B,int[] C)
    {
        int ABx=B[0]-A[0];
        int ACy=C[1]-A[1];
        int ABy=B[1]-A[1];
        int ACx=C[0]-A[0];
        return Math.abs(ABx*ACy-ABy*ACx);
    }
}