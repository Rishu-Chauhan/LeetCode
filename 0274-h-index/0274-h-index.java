class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
          int n=citations.length;
        int si=0;
        int ei=n-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(citations[mid]==(n-mid)){
                return citations[mid];
            }
            else if(citations[mid]>(n-mid)){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return n-si;
    }
}