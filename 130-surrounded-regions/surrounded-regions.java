class Solution {
    int di[]={-1,0,1,0};
    int dj[]={0,1,0,-1};
    public void solve(char[][] a) {
        int r=a.length,c=a[0].length;
        boolean m[][]=new boolean[r][c];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || i==r-1 || j==0 || j==c-1){
                    if(a[i][j]=='O'){
                        m[i][j]=true;
                        q.add(new Pair(i,j));
                    }
                }
            }
        }
        while(!q.isEmpty()){
            var k=q.remove();
            int i1=k.i,j1=k.j;
            for(int k1=0;k1<4;k1++){
               int  i=i1+di[k1];
                int j=j1+dj[k1];
                if(i>=0 && j>=0 && i<r && j<c && !m[i][j] && a[i][j]=='O'){
                    q.add(new Pair(i,j));
                    m[i][j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j])a[i][j]='O';
                else a[i][j]='X';
            }
        }
       return ;

    }
}
class Pair{
    int i,j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}