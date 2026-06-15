class Solution {
    int f(int i,int buy,int[]p,int [][]dp){
        if(i>=p.length)return 0;
        if(dp[i][buy]!=-1)return dp[i][buy];
        int profit=0;
        if(buy==1){
            int bought=-p[i]+f(i+1,0,p,dp);
            int skip=0+f(i+1,1,p,dp);
            profit+=Math.max(bought,skip);
        }else{
            int sold=p[i]+f(i+1,1,p,dp);
            int skip=0+f(i+1,0,p,dp);
            profit+=Math.max(sold,skip);
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] p) {
        int n=p.length;
        int [][]dp=new int[n][2];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(0,1,p,dp);
        return ans;
    }
}