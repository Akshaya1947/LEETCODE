class Solution {
    public int totalNumbers(int[] digits) {
        //3 digit even value and also 222 not possible(same number occur once)
        int n=digits.length;
        boolean[] seen = new boolean[1000];//to avoid repeation
        //three elements for three digits (i,j,k) i for hundred place , j for tens place, k for one place
        for(int i=0;i<n;i++){
              if(digits[i]==0){//first element should not be zero
                continue;
              }
              for(int j=0;j<n;j++){
                if(i==j) continue;//i , j should not be in same place
                for(int k=0;k<n;k++){
                   if(k==i || k==j) continue;//it should not in i,j place 
                   int num=(digits[i]*100)+(digits[j]*10)+(digits[k]*1);//i and then we have to check this is divisble by 2 or not
                   if(num%2==0){
                    seen[num]=true;
                   }
                }
              }
        }
       //to make count how many distinct value is present
       int c=0;
       for(boolean exists:seen){
        if(exists)c++;
       }
       return c;
    }
}