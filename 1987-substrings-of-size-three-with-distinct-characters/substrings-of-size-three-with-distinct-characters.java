class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        Map<Character,Integer> mp=new HashMap<>();
        if(s.length()<3)return 0;
        for(int i=0;i<3;i++){
            char ch=s.charAt(i);
            mp.put(ch,1+mp.getOrDefault(ch,0));
        }
        if(mp.size()==3)c++;
        for(int i=1;i<s.length()-2;i++){
            char add=s.charAt(i+2);
            char del=s.charAt(i-1);
            mp.put(add,1+mp.getOrDefault(add,0));
            mp.put(del,mp.get(del)-1);
            if(mp.get(del)==0)mp.remove(del);
            if(mp.size()==3)c++;
        }
        return c;
    }
}