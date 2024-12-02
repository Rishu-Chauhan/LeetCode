class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
      String word[]= sentence.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].length()>=searchWord.length() && word[i].substring(0,searchWord.length()).equals(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}