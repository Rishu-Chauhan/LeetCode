class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuffer sb=new StringBuffer();
        while(a>0 && b>0){
            if(a>b){
                sb.append("aa").append("b");
                a-=2;
                b-=1;
            }
            else{
                //a<=b
                if(a==b && a==1){
                    sb.append("a").append("b");
                    a-=1;
                    b-=1;
                    continue;
                }
                sb.append("a").append("bb");
                a-=1;
                b-=2;
            }
        }
        while(a>0){
            sb.append("a");
            a--;
        }
        while(b>0){
            sb.insert(0,"b");
            b--;
        }
        return sb.toString();
    }
}