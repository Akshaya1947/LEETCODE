class Solution {
     int f(int i,int j,String s,String t,int [][]dp){
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=1+f(i-1,j-1,s,t,dp);//if common element present add 1 to answer and decrease both pointer
        }
        //if no common you have two choice either you can move left or right
        int left=0+f(i-1,j,s,t,dp);//if you move left decrease the i pointer
        int right=0+f(i,j-1,s,t,dp);//if you move right you can move the j pointer 
        return dp[i][j]=Math.max(left,right);
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int m=t1.length(),n=t2.length();
        int [][]dp=new int[m][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(m-1,n-1,t1,t2,dp);
        return ans;
    }
    public int minDistance(String w1, String w2) {
        int m=w1.length(),n=w2.length();
        int lcs=longestCommonSubsequence( w1, w2);
        return (m-lcs)+(n-lcs);
    }
}