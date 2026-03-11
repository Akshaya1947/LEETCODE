int maxSubArray(int* nums, int n) {
    int cs=0,ms=nums[0];
    for(int i=0;i<n;i++){
        cs=cs+nums[i];
        if(cs>ms)ms=cs;
        if(cs<0)cs=0;//avoiding next sussequent subarray
        //while computing the sum if the sum become negative value then the cs become 0 and next array value is updated to cur sum
    }
    return ms;
}