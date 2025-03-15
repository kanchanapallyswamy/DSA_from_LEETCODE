class Solution {
    public boolean wordPattern(String s, String t) {
        String a[]=t.split(" ");
        Map<String,Character> mp1=new HashMap<>();
        Map<Character,String> mp=new HashMap<>();
        if(s.length()!=a.length)return false;
        for(var i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String ch1=a[i];
            if(!mp.containsKey(ch))mp.put(ch,ch1);
            else if(!mp.get(ch).equals(ch1)){
                return false;
            }
            if(!mp1.containsKey(ch1))mp1.put(ch1,ch);
            else if(!mp1.get(ch1).equals(ch))return false;
        }
        // System.out.println(mp);
        // for(var i=0;i<a.length;i++){
        //    String ch=a[i];
        //    char ch1=s.charAt(i);
        //     if(!mp1.containsKey(ch))mp1.put(ch,ch1);
        //     else if(!mp1.get(ch).equals(ch1))return false;
        // }
        // System.out.println(mp1);
        // System.out.println();
        return true;
    }
}