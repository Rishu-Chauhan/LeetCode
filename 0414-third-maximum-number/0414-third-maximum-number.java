class Solution {
    public int thirdMax(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:set){
            list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()<3){
            return list.get(0);
        }
        return list.get(2);
    }
}