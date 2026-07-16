class Solution {
public:
    int gcdd(int a,int b){
         if (b == 0)
        return a;
    return gcdd(b, a % b);
    }
    int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }

        int gc=gcdd(oddsum,evensum);
        return gc;
    }
};