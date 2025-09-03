int missingNumber(int* nums, int numsSize) {
    int n = numsSize, sum = 0, sum2, i;
    for(i = 0; i < n; i++)
        sum += nums[i];
    sum2 = n * (n + 1) / 2;
 
    return sum2 - sum;
}  