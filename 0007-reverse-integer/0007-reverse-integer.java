class Solution {
    public int reverse(int x) {
// long reversed = 0;
//         while (x != 0) {
//             reversed = reversed * 10 + x % 10;
//             x /= 10;
//         }
//  if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
//             return 0;
//         }
//         return (int) reversed;
        StringBuilder sb=new StringBuilder();
        String str=Integer.toString(x);
        if(str.charAt(0)=='-'){
            sb.append(str.substring(1));
            String s=str.charAt(0)+sb.reverse().toString();
           try{
                int n=Integer.parseInt(s);
                return n;
           }
            catch(NumberFormatException e){
                return 0;
            }
        }
        else{
            sb.append(str);
            sb.reverse();
           try{
                int n1=Integer.parseInt(sb.toString());
                return n1;
           }
            catch(NumberFormatException e){
                return 0;
            }
        }
        
    }
}