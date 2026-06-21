class Solution {
    int f(int i,int buy,int k,int []p,int [][][]dp){
        if(k==0)return 0;
        if(i>=p.length)return 0;
        if(dp[i][buy][k]!=-1)return dp[i][buy][k];
        int profit=0;
        if(buy==1){
            int bought=-p[i]+f(i+1,0,k,p,dp);
            int skip = 0+f(i+1,1,k,p,dp);
            profit+=Math.max(bought,skip);
        }else{
            int sell= p[i]+f(i+1,1,k-1,p,dp);
            int skip=0+f(i+1,0,k,p,dp);
            profit+=Math.max(sell,skip);
        }
        return dp[i][buy][k]=profit;
    }
    public int maxProfit(int[] p) {
       int n=p.length;
       int [][][]dp = new int[n][2][3]; 
       for(int [][]row:dp){
        for(int []r:row){
            Arrays.fill(r,-1);
        }
       }
       int ans = f(0,1,2,p,dp);
       return ans;
    }
}