class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
         return false;
        }
        int right=0;
        int original=x;
        while(x>0){
            int left=x%10;
            right=(right*10)+left;
            x=x/10;
        }
        if(original==right){
            return true;
        }
        return false;
    }
}