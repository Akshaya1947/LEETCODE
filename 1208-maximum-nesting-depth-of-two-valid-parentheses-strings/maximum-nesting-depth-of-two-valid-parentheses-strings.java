class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int []res= new int[n];
        int d=0;
        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                res[i]=d%2;
                d++;
            }else{
                d--;
                res[i]=d%2;
            }
        }
        return res;
    }
}
//if '(' => %2(because only two group) =>+1
//if ')' => -- =>%2

//Test case:
//qp=(()())
//split the paranthsis into two groups a,b
//group a (which is 0): () //antha question la irunthu oru valid paranthesis group a la potukanum remaning a group b la potukanum
//group b (which is 1): (())
//next op la first paranthesis entha group la varutho antha number podanum that is [1]
//next paranthesis group a la iruku so [1,0] ipdi antha paranthesis ku podanum
//multiple ans can exist
