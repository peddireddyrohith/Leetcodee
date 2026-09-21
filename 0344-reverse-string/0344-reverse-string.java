class Solution {
    public void reverseString(char[] s) {
        char[] result = reverse(s);

        for(int i = 0; i < s.length; i++) {
            s[i] = result[i];
        }
    }
    public char[] reverse(char[] t){
        StringBuilder n = new StringBuilder();
        for(char ch : t ){
            n.append(ch);
        }
        n = n.reverse();
        String m = n.toString();
        char[] res = new char[m.length()];
        for(int i = 0; i<m.length();i++){
            res[i] = m.charAt(i);
        }
        return res;

    }
}