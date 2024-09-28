class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> list1=new ArrayList<>();
        for(String s:word1){
            for(char c:s.toCharArray()){
                list1.add(c);
            }
        }
         List<Character> list2=new ArrayList<>();
        for(String s:word2){
            for(char c:s.toCharArray()){
                list2.add(c);
            }
        }
        if(list1.size()!=list2.size()){
            return false;
        }
        int size1=list1.size();
        for(int i=0;i<size1;i++){
          if(list1.get(i)!=list2.get(i)){
              return false;
          }
        }
        return true;
    }
}