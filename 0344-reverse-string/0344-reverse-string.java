class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
       for(char c:s){
           st.push(c);
       }
        int i=0;
        while(!st.isEmpty()){
            s[i++]=st.pop();
        }
    }
}