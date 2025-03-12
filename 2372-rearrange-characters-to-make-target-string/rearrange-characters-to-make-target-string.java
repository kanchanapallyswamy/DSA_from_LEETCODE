class Solution {
    public int rearrangeCharacters(String s, String t) {
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> mp1=new HashMap<>();
        int min=s.length()+1;
        for(var i:t.toCharArray())mp.put(i,1+mp.getOrDefault(i,0));
        // for(var i:mp.entryset())
          System.out.println(mp);

        for(var i:s.toCharArray())if(mp.containsKey(i))mp1.put(i,1+mp1.getOrDefault(i,0));
        System.out.println(mp1);
        if(mp1.size()==0 || mp.size() > mp1.size())return 0;
        for(var i:t.toCharArray()){
            min=Math.min(min,mp1.get(i)/mp.get(i));
        }
        return min;
    }
}