int maxProfit(int* prices, int n) {
    int cp=0,mp=0,mbp=prices[0];
    //fix the array first nums as minimum buy price if the other num is less than the mbp then update mbp  which is called buy the stock or else find the cp which means sell the stock if the cp is greater than mp update the cp and finally return the mp 
    for(int i=1;i<n;i++){
        if(prices[i]<mbp)mbp=prices[i];
        else{
            cp=prices[i]-mbp;
            if(cp>mp)mp=cp;
            
        }
    }
    return mp;
}