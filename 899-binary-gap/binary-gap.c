int binaryGap(int n) {
    int res = 0;
    int lastPosition = -1;  
    for (int i = 0; n > 0; i++) {
    if (n & 1) {
  if (lastPosition != -1) {
                res = fmax(res, i - lastPosition);
            }
            lastPosition = i;
        }
         n >>= 1;
    }
    
    return res;
    }
