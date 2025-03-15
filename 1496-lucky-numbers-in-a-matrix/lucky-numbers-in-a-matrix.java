class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        int r=m.length,c=m[0].length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int row_min=find_row_min(m,i,j,r,c);
                int col_max=find_col_max(m,i,j,r,c);
                if(row_min == col_max)l.add(m[i][j]);
            }
        }
        return l;
    }
    int find_row_min(int m[][],int i,int j,int r,int c){
        int min=Integer.MAX_VALUE;
        for(int p=0;p<c;p++){
            min=Math.min(min,m[i][p]);
        }
        return min;
    }
    int find_col_max(int m[][],int i,int j,int r,int c){
        int max=Integer.MIN_VALUE;
        for(int p=0;p<r;p++){
            max=Math.max(max,m[p][j]);
        }
        return max;
    }
}