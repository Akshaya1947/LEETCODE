class Solution {
    boolean f(int i,int j, String s,String p, int [][]dp){
        if(i==s.length()){
            while(j<p.length() && p.charAt(j)=='*')j++;
            if(j==p.length()) return true;
            return false;
        }
        boolean ans;
        if(j==p.length())return false;
        if(dp[i][j]!=-1)return dp[i][j]==1;
        if(s.charAt(i)==p.charAt(j)){
            ans=f(i+1,j+1,s,p,dp);
        }
        else{
            if(p.charAt(j)=='?') ans=f(i+1,j+1,s,p,dp);
            else if(p.charAt(j)=='*')  ans = f(i+1,j,s,p,dp)|| f(i,j+1,s,p,dp);
            else return ans=false;
        }
         dp[i][j]= ans? 1:0;
        return ans;
    }

    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();
        int [][]dp = new int[n+1][m+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        boolean ans = f(0,0,s,p,dp);
        return ans;
    }
}