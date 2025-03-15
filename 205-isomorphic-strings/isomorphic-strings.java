class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mp=new HashMap<>();
        Map<Character,Character> mp1=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(var i=0;i<s.length();i++){
            char ch=s.charAt(i),ch1=t.charAt(i);
            if(!mp.containsKey(ch))mp.put(ch,ch1);
            else if(mp.get(ch)!=ch1)return false;
        }
        for(var i=0;i<s.length();i++){
            char ch=t.charAt(i),ch1=s.charAt(i);
            if(!mp1.containsKey(ch))mp1.put(ch,ch1);
            else if(mp1.get(ch)!=ch1)return false;
        }
        return true;
    }
}