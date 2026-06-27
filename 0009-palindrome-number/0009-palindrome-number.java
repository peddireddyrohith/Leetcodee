class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=String.valueOf(x);
        int left=0;
        int right=s.length()-1;
        while(right>left){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }return true;
    }
}