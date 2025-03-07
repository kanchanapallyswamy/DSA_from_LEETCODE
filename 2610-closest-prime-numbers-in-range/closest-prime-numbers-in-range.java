class Solution {
    public int[] closestPrimes(int left, int right) {
        int n=1000001;
        List<Integer> l=new ArrayList<>();
        List<Pair> outer=new ArrayList<>();
        boolean p[]=new boolean[1000001];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(int j=i*i;j<n;j+=i){
                    p[j]=false;
                }
            }
        }
        for(int i=left;i<=right;i++){
            if(p[i])l.add(i);
        }

        System.out.println(l);
        for(int i=0;i<l.size()-1;i++){
                int m=l.get(i+1);
                int m1=l.get(i);
                outer.add(new Pair(m1,m,Math.abs(m1-m)));

        }
        outer.sort( (x,y) ->{
            return x.c-y.c;
        });
        for(var i:outer){
            System.out.println(i.a+" "+i.b+" "+i.c);
        }
        if(l.size()<2)
        return new int[]{-1,-1};
        return new int[]{outer.get(0).a,outer.get(0).b};
    }
}
class Pair{
    int a,b,c;
    Pair(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}