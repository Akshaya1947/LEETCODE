class Solution {
    int f(int i,int j, String s,int [][]dp){
        if(i==j)return 1;
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+f(i+1,j-1,s,dp);
        }
        int left=f(i+1,j,s,dp);
        int right= f(i,j-1,s,dp);
        return dp[i][j]=Math.max(left,right);
    }
    public int longestpalindrome(String s){
        int m=s.length(),n=s.length();
        int [][]dp=new int[m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(0,n-1,s,dp);
        return ans;
    }
    public int minInsertions(String s) {
        int n=longestpalindrome(s);
        int m=s.length();
        return m-n;
    }
}