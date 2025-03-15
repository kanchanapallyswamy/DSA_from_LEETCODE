class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mp1=new HashMap<>();
        Map<Character,Integer> mp2=new HashMap<>();
        for(var i:s.toCharArray())mp1.put(i,1+mp1.getOrDefault(i,0));
        for(var i:t.toCharArray())mp2.put(i,1+mp2.getOrDefault(i,0));
        return mp1.equals(mp2);
        
    }
}