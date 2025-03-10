class Solution {
    public int maxSum(int[] a) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Pair> lst=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int max=get_max(a[i]);
            lst.add(new Pair(max,a[i]));
            mp.put(max,1+mp.getOrDefault(max,0));
        }

        lst.sort( (m,n) ->{
            if(m.x!=n.x)return n.x-m.x;
            return n.y-m.y;
        });
for(var i:lst)System.out.print(i.x+"->"+i.y+"  ");
int max=-1;
        for(var i=0;i<lst.size()-1;i++){
            if(lst.get(i).x==lst.get(i+1).x)if(lst.get(i).y+lst.get(i+1).y >max ) max=lst.get(i).y+lst.get(i+1).y;
            }

        // if(lst.get(0).x!=lst.get(1).x)return -1;
        // return lst.get(0).y+lst.get(1).y;
        return max;
    }
    int get_max(int x){
        int max=0;
        while(x!=0){
            max=Math.max(max,x%10);
            x=x/10;
        }
        return max;
    }
}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;this.y=y;
    }
}