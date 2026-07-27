class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.offer(num);
        }
        int flar = pq.poll();
        int slar = pq.poll();
        return (flar-1)*(slar-1);
    }
}