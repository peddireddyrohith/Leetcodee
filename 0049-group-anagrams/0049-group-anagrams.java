class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorrt = new String(chars);
            map.putIfAbsent(sorrt,new ArrayList<>());
            map.get(sorrt).add(strs[i]);
        }
        ans.addAll(map.values());
        return ans;
    }
}