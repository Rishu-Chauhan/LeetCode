class Solution {
    public boolean isSameAfterReversals(int num) {
        String s=Integer.toString(num);
        StringBuilder sb=new StringBuilder(s).reverse();
         int reversedNum = Integer.parseInt(sb.toString());
        StringBuilder sb1 = new StringBuilder(Integer.toString(reversedNum)).reverse();
          int ReversedNum1 = Integer.parseInt(sb1.toString());
        if(ReversedNum1==num){
            return true;
        }
        return false;
    }
}