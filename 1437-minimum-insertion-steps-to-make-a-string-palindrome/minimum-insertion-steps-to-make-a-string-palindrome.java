class Solution {
    int f(int i,int j ,String s,int [][]dp){
        if(i==j)return 1;//if both are in smae position return 1 which means you can element in middle
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+f(i+1,j-1,s,dp);//here the both element is the part of palindrome for that adding 2 
        }
        int left=f(i+1,j,s,dp);
        int right=f(i,j-1,s,dp);
        return dp[i][j]=Math.max(left,right);
    }
    public int longestPalindromeSubseq(String s) {
        int m=s.length(),n=s.length();
        int [][]dp =new int[m][m];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(0,m-1,s,dp);//i will start from zero and j will start from j
        return ans;
    }

    public int minInsertions(String s) {
        int lps=longestPalindromeSubseq( s);
        int n=s.length();
        return n-lps;//this will return the number of insertion that made to make the string  palindrome 
    }
}