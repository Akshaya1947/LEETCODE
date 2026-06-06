class Solution {
    //   int [] arr =  new int[n+1];
    //   if(n<=2){
    //     return n;
    //   }  
    //   arr[0]=0;
    //   arr[1]=1;
    //   arr[2]=2;
    //   for(int i=3;i<=n;i++){
    //     arr[i]=arr[i-1]+arr[i-2];
    //   }
    //   return arr[n];
    int f(int i,int []dp){
        if(i==1 || i==2) {
         dp[i]=i;
            return i;
        }
        if(dp[i]!=-1) return dp[i];
        int one =f(i-1,dp);
        int two = f(i-2,dp);
        dp[i]=one + two;
        return dp[i];
    }
    public int climbStairs(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=f(n,dp);
        return ans;
    }
}