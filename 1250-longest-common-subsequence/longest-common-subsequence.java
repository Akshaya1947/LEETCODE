class Solution {
    int f(int i,int j,String t1,String t2,int [][]dp){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)){
            return dp[i][j]=1+f(i-1,j-1,t1,t2,dp);
        }
        int left=f(i-1,j,t1,t2,dp);
        int right=f(i,j-1,t1,t2,dp);
        return dp[i][j]=Math.max(left,right);
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int m=t1.length(),n=t2.length();
        int [][]dp = new int[m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(m-1,n-1,t1,t2,dp);
        return ans;
        
    }
}