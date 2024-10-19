class Solution {
    public char findKthBit(int n, int k) {
        String sn=fn(n);
        return sn.charAt(k-1);
    }
    public String fn(int n){
        if(n==1){
            return "0";
        }
        String prv=fn(n-1);
        return prv+"1"+invertedAndReverse(prv);
    }
    public String invertedAndReverse(String s){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c=='0' ? '1':'0');
        }
        return sb.reverse().toString();
    }
}