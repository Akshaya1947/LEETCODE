class Solution {
    int f(int i,int j,int [][]dp){
        if(i<0 || j<0)return 0;
        if(i==0&&j==0) return dp[i][j]=1;
        if(dp[i][j]!=-1) return dp[i][j];
        //choices
        int up=f(i-1,j,dp);
        int left=f(i,j-1,dp);
        return dp[i][j]=left+up;
    }
    public int uniquePaths(int m, int n) {
        int [][] dp=new int[m][n];
        for(int []row: dp){
            Arrays.fill(row,-1);
        }
        int ans=f(m-1,n-1,dp);
        return ans;
    }
}