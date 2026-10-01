//brute force
// class Solution {
//     public void setZeroes(int[][] matrix) {
//        int m=matrix.length;
//        int n=matrix[0].length;
//        int [][]copy = new int[m][n];
//        for(int i=0;i<m;i++)copy[i]=matrix[i].clone()//clone is to create and return an exact copy of an existing object 
//        for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(copy[i][j]==0){//checking the copy array if any zero is there if yes change in original array n again check the copy array
//                 for(int k=0;k<n;k++)matrix[i][k]=0;
//                 for(int k=0;k<m;k++)matrix[k][j]=0;
//             }
//         }
//        }
//     }
// }

//optimal
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n]; 
       for(int i=0;i<m;i++)//this loop is used to mark which row n col has zero
            for(int j=0;j<n;j++)
                if(matrix[i][j]==0){
                    row[i]=true;//row
                    col[j]=true;//col
                }
        for(int i=0;i<m;i++)//enga la true iruka anga row n col ah zero ah change pananum
           for(int j=0;j<n;j++)
           if(row[i]|| col[j])matrix[i][j]=0;
    }
}
//brute force
//traverse the matrix, if we find zeroo =>change the whole row and solumn element to zero
//copy eaduthu vaichikanum apo tha oru row ah zero ah change panita , next question la enga zero iruko anga matum change panna pothum
//t.c:O(m.n(m+n)) s.c:O(m.n)

//optimal
//create two arrays rows,cols, size m,n
//traverse the matrix
//if we find zero =>mark row[i] = true, mark col[j]=true
//traverse the matrix
//if row[i]||col[j]==true =>matrix[i][j]=0
//t.c

//we can still reduce the space complexity..