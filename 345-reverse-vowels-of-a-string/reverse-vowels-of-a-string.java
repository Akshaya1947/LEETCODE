class Solution {
    public String reverseVowels(String s) {
        char []word = s.toCharArray();//convert it into char 
        int start =0;
        int end=s.length()-1;
        String v="aeiouAEIOU";
        while(start<end){
                                              //ex:Apple
            while(start<end && v.indexOf(word[start])==-1){//this loop will run until the element is vowel
                //first it will take A and check if it is present in the vowels or not if it present it will return the index of A (ex as 0)then check 0==-1 false so the element is vowels
                start++;
            }
            while(start<end && v.indexOf(word[end])==-1){//same as above
                end--;
            }
            char t=word[start];
            word[start]=word[end];
            word[end]=t;
             start++;
             end--;
        }
        String ans = new String(word);
        return ans;
    }
}