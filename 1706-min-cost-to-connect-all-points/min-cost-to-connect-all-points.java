class Solution {
  public int minCostConnectPoints(int[][] edges) {
    int ans = 0;
    int n = edges.length;
    UFDS ss = new UFDS(n);
    List < Edge > l = new ArrayList < > ();
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int u1 = edges[i][0], u2 = edges[i][1], v1 = edges[j][0], v2 = edges[j][1];
        int w = (Math.abs(u2 - v2) + Math.abs(u1 - v1));
        l.add(new Edge(i, j, w));
      }
    }
    Collections.sort(l, (x, y) -> {
      return x.w - y.w;
    });
    // System.out.println(l.size());
    int i = 0, cnt = 0;
    while (cnt != n - 1) {
      var k = l.get(i);
      if (ss.merge(k.u, k.v)) {
        cnt++;
        ans += k.w;
      }
      i++;
    }
    return ans;
  }
}
class UFDS{
    int n;
    int p[];
    UFDS(int n){
        this.n=n;
        p=new int[n];
        for(int i=0;i<n;i++)p[i]=i;
    }
    int find(int x){
        if(x==p[x])return x;
        return p[x]=find(p[x]);
    }
    boolean merge(int x,int y){
        int l_x=find(x),l_y=find(y);
        if(l_x==l_y)return false;
        p[l_y]=l_x;
        return true;
    }
}
class Edge{
    int u,v,w;
    Edge(int u,int v,int w){
        this.u=u;this.v=v;this.w=w;
    }
    
}