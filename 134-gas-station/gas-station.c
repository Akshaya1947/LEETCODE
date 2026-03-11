int canCompleteCircuit(int* gas, int gasSize, int* cost, int costSize) {
    int t=0,ans=0,rg=0;
    for(int i=0;i<gasSize;i++){
        t+=gas[i]-cost[i];
        rg=rg+gas[i]-cost[i];
        if(rg<0){
            ans=i+1;
            rg=0;
        }
    }
    return t<0 ? -1 : ans;
}