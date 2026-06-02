class Solution {
    public int f(int[] nums,int k){
        int l=0,sum=0,cnt=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int f1=f(nums, goal);
        if (goal==0){
            return f1;
        }
        int f2=f( nums, goal-1);
        return f1-f2;
    }
}