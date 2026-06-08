class Solution {
    int f(int i,int []nums,int []dp){
        if(i<0)return 0;
        if(i==0) return dp[0]=nums[0];
        if(dp[i]!=-1)return dp[i];
        int not_pick=0+f(i-1,nums,dp);
        int pick=nums[i]+f(i-2,nums,dp);//we have to skip the adjacent index so we use i-2;
        return dp[i]=Math.max(pick,not_pick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=f(n-1,nums,dp);
        return ans;
    }
}