class Solution {
    public int[] findOrder(int n, int[][] p) {
        //create a adj list and indegree array
        int indegree[]= new int[n];
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : p){
            int a =edge[0],b= edge[1];
            indegree[a]++;
            adj.get(b).add(a);
        }
        //find topological sort
        Queue<Integer>q= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int[] ans = new int[n];
        int i=0;
        while(!q.isEmpty()){
            int node =q.poll();
           ans[i]=node;//i=n-1 i++ means i==n which means array filled so return tha answer or else return the empty array
            i++;//
            //check the adjacent connections
            for(int a: adj.get(node)){
                indegree[a]--;
                if(indegree[a]==0){
                    q.offer(a);
                }

            }
        }
        return i==n? ans: new int[0];//if it is valid return tha ans or else return the empty arry which you cannot take any course
    }
}