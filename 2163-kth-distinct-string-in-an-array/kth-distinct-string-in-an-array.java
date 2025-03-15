class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mp=new HashMap<>();
        for(var i:arr)mp.put(i,1+mp.getOrDefault(i,0));
        int p=1;
        for(var i:arr){
            if(mp.get(i)==1 && p==k)return i;
            else if(mp.get(i)==1)p++;
        }
        return "";
    }
}