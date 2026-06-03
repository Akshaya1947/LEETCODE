class Solution {
    int f(int day,int []arr,int k){
        int flowers=0,b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                flowers++;
                if(flowers==k){
                    b++;
                    flowers=0;
                }
            }else{//un bloomed flowers
                flowers=0;
            }
        }
        return b;
    }
    public int minDays(int[] arr, int m, int k) {
        if((long)m*k>arr.length) return -1;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        int l=1,h=maxi;
        while(l<=h){
            int mid=(l+h)/2;
            int b=f(mid,arr,k);
            if(b<m){
                l=mid+1;
            }else h=mid-1;
        }
        return l;
    }
}