class Solution {
    public String addBinary(String a, String b) {
        int n=a.length();
        int m=b.length();
        int i=n-1;
        int j=m-1;
        int cry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0){
            int n1=i>=0 ? a.charAt(i)-'0' :0;
               int n2=j>=0 ? b.charAt(j)-'0' :0;
            
            int ans=(n1+n2+cry) %2;
            cry=(n1+n2+cry) /2;
            
            sb.insert(0,ans);
            i--;
            j--;
        }
        if(cry>0){
            sb.insert(0,"1");
        }
        int start=0;
        while(start<sb.length() && sb.charAt(start)=='0'){
            start++;
        }
        return start==sb.length() ? "0" : sb.substring(start);
    }
}