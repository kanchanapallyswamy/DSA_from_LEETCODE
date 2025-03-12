class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(var i:nums)mp.put(i,1+mp.getOrDefault(i,0));
        int max=0;
        for(var i:mp.entrySet())if(i.getValue()>max)max=i.getValue();
        for(var i:mp.entrySet())if(max==i.getValue())return i.getKey();
        return -1;
    }
}