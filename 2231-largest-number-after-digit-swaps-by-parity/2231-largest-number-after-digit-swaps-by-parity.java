class Solution {
    public int largestInteger(int num) {
        String s = String.valueOf(num);
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        for(char ch:s.toCharArray()){
            int digit = ch -'0';
            if(digit%2 == 0){
                even.offer(digit);
            }else{
                odd.offer(digit);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            int digit = ch-'0';
            if(digit%2 ==0){
                ans.append(even.poll());
            }else{
                ans.append(odd.poll());
            }
        }
        return Integer.parseInt(ans.toString());

    }
}