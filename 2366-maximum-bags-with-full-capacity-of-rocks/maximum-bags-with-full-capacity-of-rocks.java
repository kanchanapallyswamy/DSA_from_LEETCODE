class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        List<Pair> l=new ArrayList<>();
        int n=c.length,j=0;
        for(int i=0;i<n;i++){
            l.add(new Pair(c[i],r[i]));
        }
        Collections.sort(l,(x,y) ->{
            return (x.c-x.r) - (y.c-y.r);
        });
        int i;
      for( i=0;i<l.size();i++){
        var p=l.get(i);
         if(p.c-p.r <= a){
                a-=p.c-p.r;

        }
        else{
           return i;
        }
      }
      return i;

    }
}

class Pair{
    int c,r;
    Pair(int c,int r){
        this.c=c;
        this.r=r;
    }
}