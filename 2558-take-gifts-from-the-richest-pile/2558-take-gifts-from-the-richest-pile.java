class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:gifts){
            pq.offer(num);
        }
        while(k-->0){
            int largest = pq.poll();
            largest =(int) Math.sqrt(largest);
            pq.offer(largest);
        }
        while(!pq.isEmpty()){
             ans+=pq.poll();
        }
        return ans;
    }
    
}