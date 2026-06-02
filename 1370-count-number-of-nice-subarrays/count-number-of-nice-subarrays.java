class Solution {
    public int f(int []nums,int k){
        int l=0,cnt=0,odd=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1)odd++;
            while(odd>k){
                if(nums[l]%2==1)odd--;
                l++;
            }
            cnt+=(r-l+1);
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      return f(nums,k)-f(nums,k-1);

    }
}