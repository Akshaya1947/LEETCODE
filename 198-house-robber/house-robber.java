class Solution {
    int f(int i,int[]dp,int []nums){
        if(i<0)return 0;
        if(i==0)return dp[i]=nums[i];
        if(dp[i]!=-1)return dp[i];
        int pick= nums[i]+f(i-2,dp,nums);
        int notpick = 0+f(i-1,dp,nums);
        return dp[i]=Math.max(pick,notpick);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp = new int[n];
       Arrays.fill(dp,-1);
       int ans = f(n-1,dp,nums);
       return ans;
    }
}