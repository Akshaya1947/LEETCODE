int divide(int dividend, int divisor) {
 long di=dividend;
 long d=divisor;
 long a=0;
 if(di==-2147483648 && d==-1){
    return 2147483647;
 }
 a=di/d;
 return (int)a;
}