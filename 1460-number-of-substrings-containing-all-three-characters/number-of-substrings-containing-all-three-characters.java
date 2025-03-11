class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int c=0,l=0;
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),1+mp.getOrDefault(s.charAt(i),0));
            while(mp.size()==3){
                c+=s.length()-i;
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0)mp.remove(s.charAt(l));
                l++;
            }
        }
        return c;
    }
}