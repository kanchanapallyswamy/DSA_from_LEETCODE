class Solution {
    public boolean divideArray(int[] a) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:a)mp.put(i,1+mp.getOrDefault(i,0));
        for(var i:mp.entrySet())if(i.getValue()%2==1)return false;
        return true;
    }
}