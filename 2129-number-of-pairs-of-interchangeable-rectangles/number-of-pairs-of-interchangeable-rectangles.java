class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
     long sum=0;//return type is long so declare in long
       Map<Double, Integer> hm=new HashMap();//Double because you have to divide and the after the decimal also it should be same
       for(var ele:rectangles){
       Double r=(double)ele[0]/ele[1];//dividing the value
        sum=sum+hm.getOrDefault(r,0);//it is for pair count
        hm.put(r,hm.getOrDefault(r,0)+1);//it is for hashmap it is present it get increment or the new value gets added to the hash map
       } 
       return sum;
    }
}