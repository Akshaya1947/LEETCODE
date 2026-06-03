class Solution {
    public int f(int speed,int [] p){
         int time=0;
        for(int i=0;i<p.length;i++){
            time+=Math.ceil(p[i]*1.0/speed);
        }        //(double)p[i]/speed
        return time;
    }
    public int minEatingSpeed(int[] p, int h) {
      int maxi=0;
      for(int i=0;i<p.length;i++){
        maxi=Math.max(maxi,p[i]);
      }
      int l=1,hi=maxi;
      while(l<=hi){
        int mid=(l+hi)/2;
        int time_taken =f(mid,p);
        if(time_taken>h){
            l=mid+1;
        }else{
            hi=mid-1;
        }
      }
      return l;
    }
}