class Solution {
    public int mirrorDistance(int n) {
        int revN = 0;
        int temp = n;
        while(n!=0){
            int rem  = n%10;
            revN = revN*10 + rem;
            n = n/10;
        }
        return Math.abs(temp - revN);
    }
}