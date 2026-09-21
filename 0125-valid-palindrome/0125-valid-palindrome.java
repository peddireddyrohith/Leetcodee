class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String t = new StringBuilder(s).reverse().toString();
        if(!s.equals(t)){
            return false;
        }
        return true;
    }
}