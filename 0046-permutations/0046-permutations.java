class Solution {
    public void Rec(int[] nums,List<List<Integer>> result,List<Integer> l){
        if(l.size()==nums.length){
            result.add(new ArrayList<>(l));
            return;
        }
        for(int num : nums){
            if(l.contains(num)){
                continue;
            }
            l.add(num);
            Rec(nums,result,l);
            l.remove(l.size()-1);
        }
    }
      
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result=new ArrayList<>();
    Rec(nums,result,new ArrayList<>());
    return result;
   } 
}