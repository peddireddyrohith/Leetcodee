class Solution {
    public int maxArea(int[] height) {
      int left = 0;
      int right = height.length -1;
      int ans;
      int max=0;
      while(left<right){
        int width = right-left;
        int ht = Math.min(height[right] , height[left]);
        ans = width*ht;
        max = Math.max(max,ans);
        if(height[left]<height[right]){left++;}else{right--;}
      }
       return max;
    }
}