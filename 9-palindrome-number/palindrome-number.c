bool isPalindrome(int x) {
 long rev=0;
long original=x;

    while(x>0){
        long res=x%10;
        rev=rev*10+res;
        x=x/10;
    }
     if(rev==original){
 return 1;
  }
  return 0;
}