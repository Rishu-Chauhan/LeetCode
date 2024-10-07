class Solution {
    public char findTheDifference(String s, String t) {
           int n = s.length();
        int m = t.length();
        
        int charSumS = 0;
        int charSumT = 0;
        
        for (char ch : s.toCharArray()) {
            charSumS += ch;
        }
        
        for (char ch : t.toCharArray()) {
            charSumT += ch;
        }
        
        return (char) (charSumT - charSumS);
    }
}