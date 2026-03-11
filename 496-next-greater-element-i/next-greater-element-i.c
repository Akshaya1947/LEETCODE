/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* nums1, int n1, int* nums2, int n2, int* returnSize) {
    *returnSize=n1;
    int *res=(int*)malloc(sizeof(int)*n1);
    for (int i=0;i<n1;i++){
       int found=0;
        res[i]=-1;// initially declare as -1 because if the no other element is greater than return -1
        for(int j=0;j<n2;j++){
            if( nums1[i]==nums2[j])found=1;//if the first array element is found in 2nd array then declare found as 1
            if(found==1 && nums2[j]>nums1[i]){
                // if the element is found and also the next element is greater enter the loop if the next is not larger check the next next element if not it return -1 
                res[i] = nums2[j];
                break;
            }
        }
    }
   return res;
}