int arraySign(int* nums, int numsSize) {
     int count=0,ans,i;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==0)
        return 0;
    }
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]<0)
            count++;
    }
    if(count%2==0)
        ans=1;
        else ans=-1;
    return ans;
}