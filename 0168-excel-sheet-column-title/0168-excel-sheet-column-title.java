class Solution {
    public String convertToTitle(int num) {
        StringBuilder str = new StringBuilder();
       while(num > 0 ){
        num--;
        int rem = num % 26;
        char c = (char)('A' + rem);
        str.append(c);
        num/=26;
       }
       return str.reverse().toString();
    }
}