class Solution {
    public boolean checkIfExist(int[] arr) {
         Set<Integer> set = new HashSet<>();
        
        for (int ar : arr) {
           
            if (set.contains(ar * 2) || (ar % 2 == 0 && set.contains(ar / 2))) {
                return true;
            }
      
            set.add(ar);
        }
        
        return false;
    }
}