class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!s.isEmpty() && k>0 && (s.peek()-'0')>num.charAt(i)-'0'){
                s.pop();
                k=k-1;
            }
            s.push(num.charAt(i));
        }
        while(k>0){
            s.pop();
            k--;
        }
        if(s.isEmpty()){
            return "0";
        }
        StringBuilder res=new StringBuilder();
        while(!s.isEmpty()){
          res.append(s.pop());
        }
         res.reverse();
          while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        
     
        if (res.length() == 0) {
            return "0";
        }
        
        return res.toString();
    }
    
}