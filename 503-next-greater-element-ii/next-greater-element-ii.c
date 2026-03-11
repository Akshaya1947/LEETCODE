/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElements(int* nums, int n, int* returnSize) {
    *returnSize=n;
    int *res = (int*)malloc(sizeof(int)*n);
    int da[2*n];//if in the question contains cirular array crete a double array and copy the value of nums to the double array
    for(int i=0;i<n;i++){
        da[i+n]=da[i]=nums[i];
    }
    for(int i=0;i<n;i++){
     res[i]=-1;
     for(int j=i+1;j<2*n;j++){
        if(da[j]>nums[i]){
            res[i]  = da[j];
            break;      
         }
           }
    }
    return res;
}