class Solution {
    public int largestRectangleArea(int[] h) {
       int n=h.length;
       int [] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int curr=h[i];
            while(!st.isEmpty()&& h[st.peek()]>=curr){//the stack is not empty and also the stack conatins largest element so we have to pop until small element
                st.pop();
            }
            if(st.isEmpty()) nse[i]=n;//if no element is smaller then the right most index
            else nse[i]=st.peek();
            st.push(i);//index push
        }
        //for finding the pse
        int [] pse=new int[n];
        st.clear();
        for(int i=0;i<n;i++){
            int curr=h[i];
            while(!st.isEmpty() && h[st.peek()]>=curr){//the stack is not empty and also the stack cintains largest element
                st.pop();
            }
            if(st.isEmpty())pse[i]=0;
            else pse[i]=st.peek()+1;//if no element is smaller then left most index
            st.push(i);
        }
        //Finding the max area = h[i]*(nse[i]-pse[i]);
        int maxi=0;
        for(int i=0;i<n;i++){
            int curr=h[i]*(nse[i]-pse[i]);
            if(curr>maxi)maxi =curr;
        }
        return maxi;
    }
}