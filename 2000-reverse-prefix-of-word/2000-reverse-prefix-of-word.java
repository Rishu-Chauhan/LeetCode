class Solution {
    public String reversePrefix(String word, char ch) {
        int right=word.indexOf(ch);
        int left=0;
        if(right==-1){
            return word;
        }
        StringBuilder sb=new StringBuilder(word.substring(left,right+1));
        sb.reverse();
        sb.append(word.substring(right+1));
        word=sb.toString();
        return word;
    }
}