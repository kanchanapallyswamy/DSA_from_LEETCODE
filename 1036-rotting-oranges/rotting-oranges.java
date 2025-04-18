class Solution {
  public int orangesRotting(int[][] grid) {
    return fill(grid);

  }
  int di[] = {-1,0,1,0};
  int dj[] = {0,1,0,-1};
  int fill(int a[][]) {
    Queue < Pair > q = new LinkedList < > ();
    int r = a.length, c = a[0].length;
    boolean visited[][] = new boolean[r][c];
    int k1 = 0, fc = 0 , l=0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (a[i][j] == 2) {
          q.add(new Pair(i, j));
          visited[i][j] = true;
        } 
        else if(a[i][j]==0)l++;
      }
    }
    if(l==r*c)return 0;
    int cnt = -1;
    while (q.size() > 0) {
      int n = q.size();
      cnt++;
      while (n--> 0) {
        var e = q.poll();
        int ni = e.i, nj = e.j;
        for (int k = 0; k < 4; k++) {
          int y = ni + di[k], z = nj + dj[k];
          if (isValid(r, c, y, z) && !visited[y][z] && a[y][z] == 1) {
            a[y][z] = 2;
            q.add(new Pair(y, z));
            visited[y][z] = true;
          }
        }
      }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]==1)fc++;
        }
    }
    return fc >=1 ? -1 : cnt ;
  }
  boolean isValid(int r, int c, int i, int j) {
    return (i >= 0 && j >= 0 && i < r && j < c);
  }

}
class Pair {
  int i, j;
  Pair(int i, int j) {
    this.i = i;
    this.j = j;
  }
}