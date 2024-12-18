class Solution {
    public int countDigits(int num) {
         int count=0;
      String s=Integer.toString(num);
      for(int i=0;i<s.length();i++){
      int digit=Character.getNumericValue(s.charAt(i));
      if(digit !=0 && num % digit==0){
        count++;
      }
      }
      return count;
        
    }
}