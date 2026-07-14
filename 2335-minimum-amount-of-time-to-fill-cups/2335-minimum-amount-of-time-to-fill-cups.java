class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:amount){
            if(num>0){
                pq.offer(num);
            }
        }
        int time = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int sec = pq.poll();
            first--;
            sec--;
            time++;
            if(first>0){
                pq.offer(first);
            }
            if(sec>0){
                pq.offer(sec);
            }
        }
        if(!pq.isEmpty()){
            time+=pq.poll();
        }
        return time;
    }
}