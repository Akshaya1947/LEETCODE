class Solution {
     int f(int i,int []nums,int []dp){
        if(i<0)return 0;
        if(i==0) return dp[0]=nums[0];//if i had  only one house you have to rob that house 
        if(dp[i]!=-1)return dp[i];//check if it is already calculated 
        int not_pick=0+f(i-1,nums,dp);
        int pick=nums[i]+f(i-2,nums,dp);//we have to skip the adjacent index so we use i-2;
        return dp[i]=Math.max(pick,not_pick);//we have to return max profit
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];//if the arrays contains single element you always pick it
        int []dp=new int[n-1];//we have to divide the array into two which is 0 to n-2 and 1 to n-1 because if i pick the frist element i dont pick the last element  vice versa
        Arrays.fill(dp,-1);
        int a=f(n-2,nums,dp);//which is 0 to n-2
        Arrays.fill(dp,-1);//for next part 1 to n-1
        int [] arr=new int[n-1];
        for(int i=1;i<n;i++){//the index is one so i create a new array to store the value form index 0
            arr[i-1]=nums[i];
        }
        int b=f(n-2,arr,dp);//ipo array oda size 6 nu iruku na first element ah vitutan apo 5 tha length but enaku last element vanthu 4 so i have to pass n-2
        return Math.max(a,b);
    }
}