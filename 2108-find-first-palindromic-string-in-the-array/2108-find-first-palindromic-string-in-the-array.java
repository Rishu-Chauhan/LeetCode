class Solution {
    public boolean isPalindrome(String str){
        int si=0;int ei=str.length()-1;
        while(si<ei){
            if(str.charAt(si)!=str.charAt(ei)){
               return false; 
            }     
        si++;
        ei--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for(String i : words){
            if(isPalindrome(i)){
                return i;
            }
        }
         return "";
    }
}