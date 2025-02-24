class Solution {
    int di[]={-1,0,1,0};
    int dj[]={0,1,0,-1};
    public int numIslands(char[][] a) {
      int r=a.length,c=a[0].length; 
      int cnt=0;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]=='1'){
                cnt++;
                floodfill(a,r,c,i,j,'1','8');
            }
        }
      } 

       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
      } 
      return cnt;
    }
    void floodfill(char a[][],int r,int c,int i,int j,char oc,char nc){
        if(i>=r || j>=c || i<0 || j<0 || a[i][j]!=oc)return ;
        a[i][j]=nc;
        for(int k=0;k<4;k++){
            floodfill(a,r,c,i+di[k],j+dj[k],oc,nc);
        }


    }
}