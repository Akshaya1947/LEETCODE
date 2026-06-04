class Solution {
    public int f(int cap,int[] w) {
        int d=1,curr=0;
        for(int i=0;i<w.length;i++){
            curr+=w[i];
            if(curr>cap){
                d++;
                curr=w[i];
            }
        }
        return d;
    }
    public int shipWithinDays(int [] w,int days){
        int lo=Integer.MIN_VALUE,hi=0;
        for(int i=0;i<w.length;i++){
            hi+=w[i];
            lo=Math.max(lo,w[i]);
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int d=f(mid,w);
            if(d>days){
                lo=mid+1;
            }
            else hi=mid-1;
        }
    return lo;
    }
}