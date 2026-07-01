class Solution {
    public String reverseStr(String st, int k) {
        // covert array to string , make a for loop and take k charcter to reverse and then leave k character leave them
        //increment the for loop  by k 
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i+=2*k){//2*k 
          int s=i;
          int end = Math.min(i+k-1,ch.length-1);//end of string 
          while(s<end){
            char t=ch[s];
            ch[s]=ch[end];
            ch[end]=t;
            s++;
            end--;
          }
    }
    return new String(ch);
    }
}