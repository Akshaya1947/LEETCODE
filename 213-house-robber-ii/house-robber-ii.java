class Solution {
    int f(int i,int []dp,int []nums){
        if(i<0)return 0;
        if(i==0)return dp[i]=nums[i];
        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+f(i-2,dp,nums);
        int notpick= 0+f(i-1,dp,nums);
        return dp[i]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1)return nums[0];
        int []dp  = new int[n-1];
        Arrays.fill(dp,-1);
        int a= f(n-2,dp,nums);
        Arrays.fill(dp,-1);
        int []arr = new int[n-1];
        for(int i=1;i<n;i++){
            arr[i-1]=nums[i];
        }
        int b=f(n-2,dp,arr);
        return Math.max(a,b);
    }
}