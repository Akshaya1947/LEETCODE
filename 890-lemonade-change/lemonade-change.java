class Solution {
    public boolean lemonadeChange(int[] b) {
        int t=0,f=0;
        for(int i=0;i<b.length;i++){
            if(b[i]==5){
                f++;
            }else if(b[i]==10){
                if(f>0){
                t++;
                f--;
            }
            else {
                return false;
            }
            }
            else{
            if(f>0 && t>0){
                f--;
                t--;
            }else if(f>2){
                f-=3;
            }else{
                return false;
            }
            }
        }
        return true;
    }
}