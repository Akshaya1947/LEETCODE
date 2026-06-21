class Solution {
    int f(int i,int j,String w1,String w2,int [][]dp){
        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]=f(i-1,j-1,w1,w2,dp);
        }
        int insert=1+f(i,j-1,w1,w2,dp);
        int replace= 1+f(i-1,j-1,w1,w2,dp);
        int del=1+f(i-1,j,w1,w2,dp);
        return dp[i][j]=Math.min(insert,Math.min(replace,del));
    }
    public int minDistance(String w1, String w2) {
        int m=w1.length(),n=w2.length();
        int [][]dp=new int[m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(m-1,n-1,w1,w2,dp);
        return ans;
        
    }
}