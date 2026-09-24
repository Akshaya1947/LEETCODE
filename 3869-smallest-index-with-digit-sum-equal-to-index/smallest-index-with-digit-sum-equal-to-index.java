class Solution {
    public int smallestIndex(int[] nums) {
      for(int i=0;i<nums.length;i++){
        int n=nums[i];//ex: 10
        int sum=0;
        while(n>0){ //10>0 //1>0
            sum+=n%10; //sum = 0+ 10%10; sum =0 // sum = 0+1%10 ; sum = 0+1 =1
            n=n/10; //n=1; // n=1/10 = 0.something
        }
        if(sum==i){//1==i(1)
            return i; // so return the index 1
        }
      }
      return -1;  
    }
}