class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp = n*(n+1)/2;
        int ans=0;
        for(int num:nums){
                 ans += num;
        }
        return exp-ans;
    }
}