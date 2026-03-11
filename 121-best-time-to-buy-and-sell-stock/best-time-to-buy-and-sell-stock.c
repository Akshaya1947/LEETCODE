int maxProfit(int* prices, int n) {
    int cp=0,mp=0,mbp=prices[0];
    for(int i=1;i<n;i++){
        if(prices[i]<mbp)mbp=prices[i];
        else{
            cp=prices[i]-mbp;
            if(cp>mp)mp=cp;
            
        }
    }
    return mp;
}