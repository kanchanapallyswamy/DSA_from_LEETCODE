class Solution {
    public List<List<Integer>> generate(int n){
        List<List<Integer>> outer =new ArrayList<>();
        if(n==0)return outer;
        List<Integer> inner =new ArrayList<>();
            inner.add(1);
            outer.add(inner);    
        for(int i=1;i<n;i++){
       List<Integer> prev =outer.get(i-1);
       List<Integer> current =new ArrayList<>();
       current.add(1);
       for(int j=1;j<i;j++){
        current.add(prev.get(j-1)+prev.get(j));
       }
       current.add(1);
       outer.add(current);


    }
    return outer;
    }
}