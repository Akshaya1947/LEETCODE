class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        int sum=0;
        long place =1;
        int d;
        while(n>0){
            d=n%10;

            if(d!=0){
                x += d * place;
                sum += d;
                place *= 10;
            }
            n/=10;
        }
        return x*sum;
    }
}