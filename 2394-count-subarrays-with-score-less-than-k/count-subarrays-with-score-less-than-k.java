class Solution {
    public long countSubarrays(int[] n, long k) {
        int l=0;
        long cnt=0,sum=0;
        for(int r=0;r<n.length;r++){
            sum+=n[r];
            while((sum*(r-l+1L))>=k){// here adding the value is not in integer range so to avoid error we are adding L to convert it to long
                sum-=n[l];
                l++;
            }
            cnt+=(r-l+1);
        }
        return cnt;
    }
}