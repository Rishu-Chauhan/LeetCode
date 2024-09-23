class Solution {
    public List<Integer> intersection(int[][] nums) {
          if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Set<Integer> set1 = new HashSet<>();
        for (int num : nums[0]) {
            set1.add(num);
        }

        for (int i = 1; i < nums.length; i++) {
            Set<Integer> set2 = new HashSet<>();
            for (int num : nums[i]) {
                if (set1.contains(num)) {
                    set2.add(num);
                }
            }
            set1 = set2;
           
        }

        List<Integer> list=new ArrayList<>(set1);
        Collections.sort(list);
        return list;
    }
}