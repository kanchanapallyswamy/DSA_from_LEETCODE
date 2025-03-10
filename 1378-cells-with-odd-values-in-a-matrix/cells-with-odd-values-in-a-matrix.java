class Solution {
    public int oddCells(int r, int n, int[][] a) {
        int m[][]=new int[r][n];
        for(int i=0;i<a.length;i++){
            fill_row(m,a[i][0]);
            fill_col(m,a[i][1]);
        }
        int c=0;
        for(int i=0;i<m.length;i++)for(int  j=0;j<m[0].length;j++)if(m[i][j]%2==1)c++;
        return c;
    }
    void fill_row(int m[][],int p){
        for(int i=0;i<m[0].length;i++){
            m[p][i]++;
        }
    }
     void fill_col(int m[][],int p){
        for(int i=0;i<m.length;i++){
            m[i][p]++;
        }
    }
}