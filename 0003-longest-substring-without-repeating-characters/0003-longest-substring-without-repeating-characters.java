class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sc = new HashSet<>();
        int left=0,maxLen=0;
        for(int i = 0;i<s.length();i++){
            while(sc.contains(s.charAt(i))){
                sc.remove(s.charAt(left));
                left++;
            }
            sc.add(s.charAt(i));
            maxLen = Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}