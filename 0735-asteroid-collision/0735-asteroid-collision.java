class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int asteroid = asteroids[i];
            boolean flag = false;
            while(!st.isEmpty() && st.peek()>0 && asteroid<0){
                if(st.peek()<-asteroid){
                    st.pop();
                }else if(st.peek() == -asteroid){
                    st.pop();
                    flag = true;
                    break;
                }else{
                    flag = true;
                    break;
                }
                
            }
            if(!flag){
                st.push(asteroid);
            }
        }
        int []result = new int[st.size()];
        for(int i=0;i<st.size();i++){
             result[i]=st.get(i);
        }
        return result;
    }
}