public class Solution {

    public long pickGifts(int[] gifts, int k) {
       
        List<Integer> giftsList = new ArrayList<>();
        for (int gift : gifts) {
            giftsList.add(-gift);
        }

    
        PriorityQueue<Integer> giftsHeap = new PriorityQueue<>(giftsList);
   
        for (int i = 0; i < k; i++) {
           
            int maxElement = -giftsHeap.poll();

            giftsHeap.offer(-(int) Math.sqrt(maxElement));
        }

     
        long numberOfRemainingGifts = 0;
        while (!giftsHeap.isEmpty()) {
            numberOfRemainingGifts -= giftsHeap.poll();
        }

        return numberOfRemainingGifts;
    }
}