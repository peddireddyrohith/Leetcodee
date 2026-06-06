class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int stack:nums){
            if(set.contains(stack)){
                return true;
            }
            set.add(stack);
        }
        return false;
    }
    
}