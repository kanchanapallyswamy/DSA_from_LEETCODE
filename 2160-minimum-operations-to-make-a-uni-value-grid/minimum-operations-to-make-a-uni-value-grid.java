class Solution {
    public int minOperations(int[][] m, int x) {
      int r=m.length,c=m[0].length,p=0;
      int a[]=new int[r*c];
      for(var i=0;i<r;i++){
        for(var j=0;j<c;j++){
            a[p++]=m[i][j];
        }
      }  
        int cnt=0;
      Arrays.sort(a);
      int median=a[a.length/2];
      System.out.println(median);
      for(var i=0;i<r;i++){
        for(var j=0;j<c;j++){
           if(m[i][j]<median){
            while(m[i][j]!=median){
                m[i][j]+=x;
                cnt++;
                if(m[i][j]>median)return -1;
            }
           }
           else if(m[i][j]!=median){
            while(m[i][j]>median){
                m[i][j]-=x;
                cnt++;
                if(m[i][j]<median)return -1;
            }
           }
        }
      }
      return cnt;
    }
}