class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int rows= grid.length;
        int cols = grid[0].length;
        int ans[] = new int[cols];
        for(int j=0;j<cols;j++){
            int maxWidth = 0;
            for(int i=0;i<rows;i++){
                int width = String.valueOf(grid[i][j]).length();
                maxWidth = Math.max(maxWidth,width);
            }
            ans[j] = maxWidth;
        }
        return ans;
    }
}