class Solution {
     int f(int i,int j,int [][]grid,int [][]dp){
        if(i<0 || j<0|| grid[i][j]==1)return 0;//the grid[i][j]==1 it menas that the obstacle is present at the position
        if(i==0&&j==0) return dp[i][j]=1;
        if(dp[i][j]!=-1) return dp[i][j];
        //choices
        int up=f(i-1,j,grid,dp);
        int left=f(i,j-1,grid,dp);
        return dp[i][j]=left+up;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
    if(grid[0][0]==1) return 0;//if the obstacle is  at starting point 
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp =new int [m][n];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        int ans=f(m-1,n-1,grid,dp);

        return ans;
    }
}