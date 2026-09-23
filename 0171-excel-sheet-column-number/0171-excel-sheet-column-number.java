class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
    for(char c : s.toCharArray()){
        int rem = (int)(c-'A'+1);
        sum = sum*26+rem;
    }
    return sum;

}
}