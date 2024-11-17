class Solution {
    public boolean uniqueOccurrences(int[] arr) {
          HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
      
        HashSet<Integer> set = new HashSet<>();
        for(int count : map.values()){
            if(!set.add(count))
                return false;
        }
        return true;
    }
}