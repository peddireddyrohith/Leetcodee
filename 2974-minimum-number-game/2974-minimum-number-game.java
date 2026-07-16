class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int arr[] = new int[nums.length];
        int idx = 0;
        for(int num:nums){
            pq.offer(num);
        }
        while(!pq.isEmpty()){
            int alice = pq.poll();
            int bob = pq.poll();
            arr[idx++] = bob;
            arr[idx++] = alice;            
        }
        return arr;
    }
}