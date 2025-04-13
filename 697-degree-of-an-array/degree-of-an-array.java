class Solution {
    public int findShortestSubArray(int[] a) {
        int n = a.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(var i : a)mp.put(i,1+mp.getOrDefault(i,0));
        int key = 0 , max = 0 , dif = Integer.MAX_VALUE;
        for(var i : mp.entrySet()){
            if(i.getValue() > max){
                max = i.getValue();
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(var i : mp.entrySet())if(i.getValue() == max)ans.add(i.getKey());
        System.out.println(ans);
        for(var j : ans){
            int fo = -1 , lo = -1;
            for(int i = 0; i < n; i++){
                if(a[i] == j){fo = i; break;}
            }
            for(int i = 0; i < n; i++){
                if(a[i] == j)lo = i;
            }
            System.out.println(j+" frst "+fo+" last "+ lo);
            dif = Math.min(dif,lo-fo+1);
        }

        return dif;
    }
}
class Pair{
    int dif;
    Pair(int dif){
        this.dif = dif;
    }
}