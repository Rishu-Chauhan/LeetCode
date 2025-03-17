class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int key:map.keySet()){
            int count=map.get(key);
            if(count % 2 !=0){
                return false;
            }
        }
        return true;
    }
}