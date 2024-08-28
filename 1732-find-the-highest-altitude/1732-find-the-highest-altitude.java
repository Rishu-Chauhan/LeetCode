class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int Max=Integer.MIN_VALUE;
        int arr[]=new int[gain.length+1];
       for(int i=0;i<gain.length;i++){
           sum+=gain[i];
           arr[i]=sum;
       } 
       for(int j=0;j<arr.length;j++){
           if(arr[j]>Max){
               Max=arr[j];
           }
       }
        return Max;
    }
}