class Solution {
    public int evalRPN(String[] tokens) {
        return evaluate(tokens);
    }
     public  int evaluate(String[] s){
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<s.length;i++){
        if (s[i].matches("-?\\d+")) {
            st.push(Integer.parseInt(s[i]));
         }
        else{
             if (st.size() < 2) {
                  
                    return Integer.MIN_VALUE;
                }
             int op2 = st.pop();
                int op1 = st.pop();

            switch (s[i]) {
             case "+":
                   st.push(op1+op2);
                    break;
              case "-":
                    st.push(op1-op2);
                     break;
              case "*":
                     st.push(op1*op2);
                      break;
               case "/":
                      st.push(op1/op2);
                       break;

               
            }
        }
    
    } 
if (st.isEmpty()) {
       
            return Integer.MIN_VALUE;
        }
    return st.peek();
   }
}