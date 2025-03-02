class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       ArrayList<Integer>l=new ArrayList<>();
       int n=edges.length;
        UFDS ss=new UFDS(n);
        for(int i=0;i<n;i++){
            int u=edges[i][0],v=edges[i][1];
            if(ss.merge(u,v)){
               return new int[]{u,v};
            }
        }
       return new int[0];
    }
}
class UFDS{
    int n;
    int p[];
    UFDS(int n){
        this.n=n;
        p=new int[n+1];
        for(int i=1;i<=n;i++)p[i]=i;
    }
    int find(int x){
        if(p[x]==x)return x;
        return p[x]=find(p[x]);
    }
    boolean merge(int x,int y){
        int l_x=find(x),l_y=find(y);
        if(l_x==l_y)return true;
        p[l_y]=l_x;
        return false;
    }
}