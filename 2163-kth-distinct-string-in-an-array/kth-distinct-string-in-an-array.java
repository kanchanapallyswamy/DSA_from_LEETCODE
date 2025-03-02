class Solution {
    public String kthDistinct(String[] a, int k) {
        Map<String,Integer> mp=new LinkedHashMap<>();
        for(var i:a)mp.put(i,1+mp.getOrDefault(i,0));
        int c=1;
        for(var i:mp.entrySet()){
            if(c==k && i.getValue()==1)return i.getKey();
            else if(i.getValue()==1)c++;
        }
        return "";
    }
}