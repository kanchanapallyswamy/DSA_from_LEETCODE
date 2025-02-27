class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
         List<List<String>> l=new ArrayList<>();
        Map<String, ArrayList<String>> mp=new HashMap<>();
        String a[]=new String[str.length];
        for(var i:str){
         String  t=find(i);
        //  System.out.println(t);
            if(!mp.containsKey(t)){
                mp.put(t,new ArrayList<>());
            }
                mp.get(t).add(i);
            // else mp.get(t).add(i);

        }
        for(var i:mp.entrySet())
        l.add(i.getValue());
      //  System.out.println(i.getKey()+"->"+i.getValue());
    
        return l;
    }
    String find(String s){
        char a[]=s.toCharArray();
        String k="";

        Arrays.sort(a);
        for(var i:a)k+=i;
        return k;
    }
}