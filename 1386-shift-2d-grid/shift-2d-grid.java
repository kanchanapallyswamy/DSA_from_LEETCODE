class Solution {
    public List<List<Integer>> shiftGrid(int[][] a, int k) {
    int r=a.length,c=a[0].length;
    for(int i=1;i<=k;i++){
         a=find(a);
    }
  List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<r;i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<c;j++){
               inner.add(a[i][j]);
            }
            l.add(inner);
        }
        return l;
    }
    int [][] find(int a[][]){
        int r=a.length,c=a[0].length;
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j!=0 ){
                    m[i][j]=a[i][j-1];
                }
               if(i==0 && j==0){
                m[i][j]=a[r-1][c-1];
               }
                else if(j==0 && i!=0){
                    m[i][j]=a[i-1][c-1];
                }
            }
        }
        return m;
    }
      
}