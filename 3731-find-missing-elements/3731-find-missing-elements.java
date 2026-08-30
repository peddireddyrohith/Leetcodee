class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int minNum = nums[0];
        int maxNum = nums[0];
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            minNum = Math.min(minNum,num);
            maxNum = Math.max(maxNum,num);
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = minNum+1;i<maxNum;i++){
            if(!set.contains(i))ans.add(i);
        }
        return ans;
    }
}