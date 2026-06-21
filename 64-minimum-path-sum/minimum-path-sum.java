class Solution {
    int f(int i,int j,int [][]grid,int [][]dp){
        if(i<0|| j<0)return Integer.MAX_VALUE;
        if(i==0 && j==0)return dp[i][j]=grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int up=f(i-1,j,grid,dp);
        int left=f(i,j-1,grid,dp);
        if(up!=Integer.MAX_VALUE)up+=grid[i][j];
        if(left!=Integer.MAX_VALUE)left+=grid[i][j];
        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int [][]dp = new int [m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans =f(m-1,n-1,grid,dp);
        return ans;
    }
}