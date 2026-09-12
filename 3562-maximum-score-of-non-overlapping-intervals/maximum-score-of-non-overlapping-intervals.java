class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
      //ipo what have i do na intervals nu array iruku athula left,right,oru weight values irukum naa endha endha interval[i] ah chose panna enaku max weight varumo athaoda index ah return pananum 
      //in first test case 5+3=8 2,3 index la iruka weigth ah add panna tha enaku max value kedaikum 
      // and also index oda range atmost 4 ah irukanum and index overlap aagakudathu
      //ithuku dp use panlam take,not take, and also naa endind index vaichu sort panna easy ah find panlam
      //but there is a problem we have to return the index value ipo na sort panna change aagidum so i have to take one copy
      //over lap ah iruka nu check panna here we using binary search 
      //dp build => dp weight,=>dp list(index)
      //lex smallest ah nu check panna we want one function
      int n=intervals.size();
      int [][]a = new int [n][4];
      for(int i=0;i<n;i++){//copying
        a[i][0]=intervals.get(i).get(0);
        a[i][1]=intervals.get(i).get(1);
        a[i][2]=intervals.get(i).get(2);
        a[i][3]=i;
      }
      Arrays.sort(a,(x,y)->Integer.compare(x[1],y[1]));
      long [][]dp=new long[n+1][5];//for max weight  dp is 2d array 
      List<Integer>[][]ids = new ArrayList[n+1][5];//for their index 
      for(int i=0;i<=n;i++){
        for(int k=0;k<=4;k++){
            ids[i][k]=new ArrayList<>();
        }
      }
      //dp
      for(int i=1;i<=n;i++){
        int start = a[i-1][0];
        long w=a[i-1][2];
        int id=a[i-1][3];
        int lo =1,hi=i-1,prev=0;
        //binary search is to find the which are not overlap
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(a[mid-1][1]<start){
                prev=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        for(int k=1;k<=4;k++){
            long skip=dp[i-1][k];
            long take = dp[prev][k-1]+w;
            List <Integer>list = new ArrayList<>(ids[prev][k-1]);
            list.add(id);
            Collections.sort(list);
            if(take>skip|| (take ==skip &&smaller(list,ids[i-1][k]))){
                dp[i][k]=take;
                ids[i][k]=list;
            }else{
                dp[i][k]=skip;
                ids[i][k]=ids[i-1][k];
            }
        }
      }
      List<Integer>best= ids[n][4];
      int []ans=new int[best.size()];
      for(int i=0;i<best.size();i++){
        ans[i]=best.get(i);
      }
      return ans;
    }
    private boolean smaller(List<Integer> a,List<Integer> b){
        int len=Math.min(a.size(),b.size());
        for(int i=0;i<len;i++){
            if(!a.get(i).equals(b.get(i))){
                return a.get(i)<b.get(i);
            }
        }
        return a.size()<b.size();
    }
}