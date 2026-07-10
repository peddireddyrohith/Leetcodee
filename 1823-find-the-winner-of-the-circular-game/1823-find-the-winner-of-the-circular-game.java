class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            circle.offer(i);
        }
        
        while (circle.size() > 1) {
            // rotate k-1 friends from front to back (skip them)
            for (int i = 0; i < k - 1; i++) {
                circle.offer(circle.poll());
            }
            // eliminate the k-th friend
            circle.poll();
        }
        
        return circle.peek();
    }
}