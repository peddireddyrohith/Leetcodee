class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows =mat.length;
        int cols = mat[0].length;
        if(rows*cols != r*c){
            return mat;
        }
        int ans[][] = new int[r][c];
        for(int k=0;k<r*c;k++){
            ans[k/c][k%c] = mat[k/cols][k%cols];
        }
        return ans;
    }
}