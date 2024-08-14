class Solution {
    public int maxArea(int[] height) {
     ArrayList<Integer> list=new ArrayList<>();
     for(int num:height){
         list.add(num);
     }
     int lp=0;
     int rp=list.size()-1;
       int  maxWater=0;
     while(lp<rp){
         int ht=Math.min(list.get(lp),list.get(rp));
         int width=rp-lp;
         int currWater=ht*width;
         maxWater=Math.max(maxWater,currWater);
         if(list.get(lp)<list.get(rp)){
             lp++;
         }
         else{
             rp--;
         }
     }
        return maxWater;
    }
}