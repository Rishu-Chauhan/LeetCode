class Solution {
    public boolean validPalindrome(String s) {
       int si=0;
        int ei=s.length()-1;
        while(si<ei){
            if(s.charAt(si)==s.charAt(ei)){
                si++;
                ei--;
            }
            else{
                if(isPalindrome(s,si+1,ei)){
                    return true;
                }
                if(isPalindrome(s,si,ei-1)){
                return true;
            }
               return false;
            }
        }
        return true;
    }
      public boolean isPalindrome(String s,int si,int ei){
       
      while(si<ei){
        if(s.charAt(si)!=s.charAt(ei)){
         return false;
        }
        si++;
        ei--;
      } 
      return true; 
    }
}