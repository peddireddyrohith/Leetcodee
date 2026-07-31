class Solution {

    public int func(int[][] grid, int r, int c, int m, int n, int[][] dp) {

        // Reached destination
        if (r == m - 1 && c == n - 1) {
            return grid[r][c];
        }

        // Already computed
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        // Move right
        if (c + 1 < n) {
            right = func(grid, r, c + 1, m, n, dp);
        }

        // Move down
        if (r + 1 < m) {
            down = func(grid, r + 1, c, m, n, dp);
        }

        dp[r][c] = grid[r][c] + Math.min(right, down);

        return dp[r][c];
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return func(grid, 0, 0, m, n, dp);
    }
}