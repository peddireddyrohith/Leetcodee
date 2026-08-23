class Solution {
    public int solve(String s1,String s2,int i,int j,int m,int n,int[][] dp){
        if(i>=m||j>=n) return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){ 
            return dp[i][j]=1+solve(s1,s2,i+1,j+1,m,n,dp);
        }
        return dp[i][j]=Math.max(solve(s1,s2,i+1,j,m,n,dp),solve(s1,s2,i,j+1,m,n,dp));    
    }
    public int longestCommonSubsequence(String s1, String s2) {
    int m = s1.length();
    int n= s2.length();
    int[][] dp = new int[m][n];
    for(int i=0;i<m;i++){
        Arrays.fill(dp[i],-1);
    }
       return solve(s1,s2,0,0,m,n,dp);
    }
}