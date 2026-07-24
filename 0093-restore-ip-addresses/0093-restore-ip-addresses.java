class Solution {
    List<String> ans  = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s,0,new ArrayList<>());
        return ans;
    }
    public void backtrack(String s, int i,List<String>curr){
        if(curr.size()==4){
            if(i==s.length()){
                ans.add(String.join(".",curr));
            }
            return;
        }
        for(int len=1;len<=3;len++){
            if(i+len>s.length())break;
            String part = s.substring(i,i+len);
            if(!isValid(part))continue;
            curr.add(part);
             backtrack(s, i + len, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public boolean isValid(String part) {
        if (part.length() > 1 && part.charAt(0) == '0')
            return false;

        int num = Integer.parseInt(part);

        return num >= 0 && num <= 255;
    }
}
    
